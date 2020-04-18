import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe (String initName, int initTime, ArrayList<String> ingredients){
        this.name = initName;
        this.time = initTime;
        this.ingredients = ingredients;
    }

    public String getName(){
        return this.name ;
    }

    public int getTime(){
        return this.time;
    }

    public String toString(){
        String result = this.name + ", cooking time: " + this.time;
        return result;
    }
    
    public ArrayList<String> getIngredient(){
        return this.ingredients;          
    }
}

