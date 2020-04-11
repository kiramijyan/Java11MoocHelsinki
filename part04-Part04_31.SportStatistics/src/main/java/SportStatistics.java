
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> games = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
   
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            
            while(fileScan.hasNextLine()){                
            
            games.add(fileScan.nextLine());
                
            }
        } catch (Exception err){
            System.out.println("Error: " + err);
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int i = 0;
        int count = 0;
        int win = 0;
        int lose = 0;

        
        
        for(i = 0; i < games.size(); i++){
            
            String line = games.get(i);
            String [] parts = line.split(",");
            // System.out.println("ONE->" + parts[0] + " TWO->" + parts[1]);


            if(parts[0].equals(team)){
                
                // counts home wins for first team
                if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                    win++;
                }
                
                // counts home wins for losses for first team
                if(Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])){
                    lose++;
                }
               
                count++;
            }
            
            if(parts[1].equals(team)){
                
                // count outdoor losses for second team
                if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                    lose++;
                }
                
                // count outdoor wins for second team
                if(Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])){
                    win++;
                }
                
                
                count++;
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
        
    }
}
