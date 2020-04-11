
public class Main {

    public static void main(String[] args) {

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package package1 = new Package();
        package1.addGift(book);
        System.out.println(package1.totalWeight());

    }
}
