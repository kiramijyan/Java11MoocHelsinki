
public class HealthStation {
    

    private int count;

    public HealthStation(){
        this.count = 0;
        
    }
    public int weigh(Person initialPerson) {
        // return the weight of the person passed as the parameter
        this.count++;
        return initialPerson.getWeight();
    }
    
    public void feed(Person initialPerson){
        initialPerson.setWeight(initialPerson.getWeight() + 1); 
    }
    
    public int weighings(){
        
        return this.count;
    }
}
