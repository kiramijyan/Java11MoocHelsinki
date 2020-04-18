import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    private String fileName;
    private String findName;
    private String findIng;
    private ArrayList<String> linesFromFile; //helper
    private String line;
    private String recipeName;
    private int time;
    private ArrayList<String> recipeIngredients;
    private int recipeTime;
    private Recipe recipeObj;  // recipe Object
    private ArrayList<Recipe> recipeList;

    public ReadFromFile(String fileName){
        this.linesFromFile = new ArrayList<>();
        this.fileName = fileName;
        this.line = "";
        this.recipeName = "";
        this.recipeTime = 0;
        this.recipeIngredients = new ArrayList<>();
        this.recipeObj = new Recipe(recipeName, recipeTime, linesFromFile);
        this.recipeList = new ArrayList<>();
    }

    public void start(){
        try (Scanner scanner = new Scanner(Paths.get(this.fileName))) {

            while (scanner.hasNextLine()) {
                this.line = scanner.nextLine();
                this.linesFromFile.add(line);
                if (this.line.isEmpty()) {
                    recipeObjList();
                    linesFromFile.clear();
                }

                if(!(scanner.hasNextLine())){
                    recipeObjList();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public void recipeObjList(){

        this.recipeName = this.linesFromFile.get(0);
        this.recipeTime = Integer.valueOf(this.linesFromFile.get(1));
        this.recipeIngredients = new ArrayList<>();

        for(int i = 2; i < linesFromFile.size(); i++){
            recipeIngredients.add(linesFromFile.get(i));
        }
        this.recipeObj = new Recipe(recipeName, recipeTime, recipeIngredients);
        this.recipeList.add(this.recipeObj);
    }

    public void runner(){
        start();
    }

    public void printRecite(){
        for(Recipe e: recipeList){
            System.out.println(e.toString());
        }
    }
    
    public void findByName(String name){
        this.findName = name;
        for(Recipe item : recipeList){
            if(item.getName().contains(this.findName)){
                System.out.println("Recipes: ");
                System.out.println(item.toString());
                System.out.println("");
            }
        }
    }
    
    public void findByTime(int time){
        int findByTime = time;
        for(Recipe item : recipeList){
            if(item.getTime() <= findByTime){
                System.out.println("Recipes: ");
                System.out.println(item.toString());
                System.out.println("");
            }
        }
    }
    
    public void findByIngredient(String ingInitial){

        for(int i = 0; i < recipeList.size(); i++){
            for(int y = 0; y < recipeList.get(i).getIngredient().size(); y++){
                //System.out.println("all Ing -> " + recipeList.get(i).getIngredient().get(y));
                if(recipeList.get(i).getIngredient().get(y).equals(ingInitial)){
                    System.out.println(recipeList.get(i).toString());
                }
            }
        }
    }
}
