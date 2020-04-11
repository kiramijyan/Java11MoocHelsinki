
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersToKeep = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
           
            while(fileScanner.hasNextLine()){
                
                numbers.add(Integer.valueOf(fileScanner.nextLine()));
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for(int i = 0; i < numbers.size(); i++){
            
            if(numbers.get(i) >= lowerBound && numbers.get(i) <= upperBound){
                numbersToKeep.add(numbers.get(i));
            }
        }
        System.out.println("Numbers: " + numbersToKeep.size());
    }
}
