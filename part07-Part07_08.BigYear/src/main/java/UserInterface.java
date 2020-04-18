/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
import java.util.Scanner;

public class UserInterface {

    private BirdList list = new BirdList();
    private Scanner scan;
    private String name;
    private String nameLatin;
    private String observation;
    private Bird bird;

    public UserInterface(Scanner initScan){
        this.scan = initScan;
    }

    public void createBird(String name, String nameLatin){
        this.bird = new Bird(name, nameLatin);
    }

    public void start(){
        while(true){
            System.out.print("? ");
            String input = scan.nextLine();

            if(input.equals("Add")){
                System.out.print("Name: ");
                this.name = scan.nextLine();
                System.out.print("Name in Latin: ");
                this.nameLatin = scan.nextLine();
                createBird(this.name, this.nameLatin);
                list.add(this.bird);
            }

            if(input.equals("Observation")){
                System.out.print("Bird? ");
                boolean birdExist = false;
                String birdName = scan.nextLine();
                for(int i = 0; i < list.getBirdList().size(); i++){
                    if(list.getBirdList().get(i).getName().equals(birdName)){
                        list.getBirdList().get(i).observation();
                        birdExist = true;
                    }
                }
                if (!birdExist){
                    System.out.println("Not a bird!");
                }
            }

            if(input.equals("All")){
                for(int i = 0; i < list.getBirdList().size(); i++){
                    System.out.println( list.getBirdList().get(i).toString());
                }
            }

            if(input.equals("One")){
                System.out.print("Bird? ");
                boolean isOnList = false;
                String oneBird = scan.nextLine();
                for(int i = 0; i < list.getBirdList().size(); i++){
                    if(list.getBirdList().get(i).getName().equals(oneBird)){
                        System.out.println(list.getBirdList().get(i).toString());
                        isOnList = true;

                    }
                }
                if (!isOnList){
                    System.out.println("Not a bird!");
                }
            }

            if(input.equals("Quit")){
                break;
            }
        }
    }


}