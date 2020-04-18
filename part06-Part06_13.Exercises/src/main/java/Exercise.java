
public class Exercise {

    private String name;
    private boolean complated;
    
    public Exercise(String name){
        this.name = name;
        this.complated = false;
    }
    
    public String getName(){
        return name;
    }
    
    public void setComplated(boolean complated){
        this.complated = complated;
    }
    
    public boolean isComplated(){
        return complated;
    }
}
