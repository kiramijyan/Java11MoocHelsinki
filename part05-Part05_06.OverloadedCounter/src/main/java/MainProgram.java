
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counterTest = new Counter(15);
        
        counterTest.decrease();
        
        System.out.println("Value is " + counterTest.value());
    }
}
