
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileName = reader.nextLine();
        
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            
            while(scanner.hasNextLine()){
                
                String fileData = scanner.nextLine();
                
                System.out.println(fileData.toString());
            }
        } catch(Exception err){
            System.out.println("Error: " + err);
        }
        
        

    }
}
