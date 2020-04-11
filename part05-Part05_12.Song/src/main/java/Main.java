
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song s1 = new Song("AAA", "BBB", 196);
        Song s2 = new Song("AAA", "BBB", 196);
        Song test = new Song ("no", "no", 200);
        
        
        if (s1.equals(s2)) {
            System.out.println("Songs are equal.");
        }

        if (s2.equals(test)) {
            System.out.println("Strange things are afoot.");
        }
    }
}
