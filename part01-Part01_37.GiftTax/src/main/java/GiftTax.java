import java.util.Scanner;
 
public class GiftTax {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.parseInt(scan.nextLine());
        double tax = 0.0;
        double taxRate = 0.0;
        double payTax = 0.0;
        
        if (value < 5000) {
            System.out.println("No tax!");
            
        } else if (value < 25000) {
          
            tax = 100;
            taxRate = (double) 8 / 100;
            payTax  = tax + (value - 5000) * taxRate;
            System.out.println("Tax: " + payTax);
            
        } else if (value < 55000) {
          
            tax = 1700;
            taxRate = (double) 10 / 100;
            payTax  = tax + (value - 25000) * taxRate;
            System.out.println("Tax: " + payTax);
            
        } else if (value < 200000) {
          
            tax = 4700;
            taxRate = (double) 12 / 100;
            payTax  = tax + (value - 55000) * taxRate;
            System.out.println("Tax: " + payTax);
            
        } else if (value < 1000000) {
          
            tax = 22100;
            taxRate = (double) 15 / 100;
            payTax  = tax + (value - 200000) * taxRate;
            System.out.println("Tax: " + payTax);
            
        } else {
            
            tax = 142100;
            taxRate = (double) 17 / 100;
            payTax  = tax + (value - 1000000) * taxRate;
            System.out.println("Tax: " + payTax);
        }
    }
}