
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();
        
        int x = 101;
        int i = 0;
        while (i < x) {
            System.out.println(timer);
            timer.advance();
            i++;
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
