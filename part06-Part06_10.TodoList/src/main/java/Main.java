
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner reader = new Scanner(System.in);
        UserInterface test = new UserInterface(list, reader);;
        
        // test.start();

    }
}
