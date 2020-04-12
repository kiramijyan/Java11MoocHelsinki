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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList initList, Scanner initScanner){
        this.list = initList;
        this.scanner = initScanner;
    }


     
    public void start(){

        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.print("To add: ");
                String userCommand = scanner.nextLine();
                list.add(userCommand);
            }

            if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                list.remove(toRemove);
            }

            if(command.equals("list")){
                list.print();
            }
        }
    }
}