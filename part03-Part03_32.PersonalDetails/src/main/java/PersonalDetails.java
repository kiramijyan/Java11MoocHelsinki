import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input;
        String longestName = "";
        double avg;
        double sum = 0;
        int count = 0;        
        
        
        while(true){
            // System.out.println("Enter");
            input = scanner.nextLine();
   
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            
            if((parts[0].length()) > longestName.length()){
                longestName = parts[0];
            }
            
            sum = sum + Integer.valueOf(parts[1]);
            
            count++;
            
            // System.out.println("test: " + (double) sum/count);
        }
        
        avg = sum/count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}
 
