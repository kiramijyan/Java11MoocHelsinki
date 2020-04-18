import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");
        
        ReadFromFile reader = new ReadFromFile(fileName);
        reader.runner();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");
            if(command.equals("stop")){
                break;
            }

            if(command.equals("list")){
                System.out.println("Recipes:");
                reader.printRecite();
                System.out.println("");
            }
            
            if(command.equals("find name")){
                System.out.print("Searched word:");
                String findName = scanner.nextLine();
                System.out.println("");
                reader.findByName(findName);
            }
            
            if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int findByTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                reader.findByTime(findByTime);
            }
            
            if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String findByIngredient = scanner.nextLine();
                System.out.println("");
                reader.findByIngredient(findByIngredient);
            }
        }
    }
}