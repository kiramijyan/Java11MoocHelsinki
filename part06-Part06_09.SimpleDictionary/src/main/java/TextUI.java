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

public class TextUI {
    private SimpleDictionary simpleDictionaryObj;
    private Scanner scanner;

    public TextUI( Scanner initScannerObj, SimpleDictionary initSimpleDictionaryObj){
        this.simpleDictionaryObj = initSimpleDictionaryObj;
        this.scanner = initScannerObj;
    }

    public void start(){

        while(true){



            System.out.print("Command: ");
            String command = scanner.nextLine();
            String word;
            String translation;

            if(command.equals("end")){
                break;
            }

            if(!command.equals("end") && !command.equals("search") && !command.equals("add")){
                System.out.println("Unknown command");
            }

            if(command.equals("add")){

                System.out.print("Word: ");
                word = scanner.nextLine();

                System.out.println("Translation: ");
                translation = scanner.nextLine();

                simpleDictionaryObj.add(word, translation);
            }

            if(command.equals("search")){

                System.out.print("To be translated: ");
                String wordToSearch = scanner.nextLine();

                if(this.simpleDictionaryObj.contains(wordToSearch)){
                    System.out.println("Translation: " + simpleDictionaryObj.translate(wordToSearch));
                } else {
                    System.out.println("Word " +  wordToSearch + " was not found");
                }
            }
        }

        System.out.println("Bye bye!");
    }
}