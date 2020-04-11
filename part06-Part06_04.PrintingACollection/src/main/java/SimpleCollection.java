import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String initName){
        this.name = initName;
        elements = new ArrayList<>();
    }

    public void add(String element){
        this.elements.add(element);
    }

    public ArrayList<String> getElements(){
        return this.elements;
    }

    public String toString(){

        String msg = "";

        if(elements.isEmpty()){
            msg =  "The collection " +  this.name + " is empty.";
        }

        if( elements.size() == 1){
            msg = "The collection " +  this.name + " has "  + elements.size() + " element:" + "\n" + elements.get(0);
        }

        if(elements.size() > 1){

            for(int i = 0; i < elements.size(); i++) {
                msg = msg + elements.get(i) + "\n";
            }

            msg = "The collection " +  this.name + " has "  + elements.size() + " elements:" + "\n" + msg;
        }

        return msg;
    }
}
