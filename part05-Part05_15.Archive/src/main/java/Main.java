
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Archive> archiveLists = new ArrayList<>();


        while(true){

            System.out.println("Identifier? (empty will stop)");
            String identifier = reader.nextLine();
            if(identifier.isEmpty()){
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name  = reader.nextLine();
            if(name.isEmpty()){
                break;
            }

            Archive archive = new Archive(identifier, name);

            if(archiveLists.contains(archive)){
                continue;
            }

            archiveLists.add(archive);

        }

        archiveLists.forEach((n) -> System.out.println(n.toString()));
    }
}
