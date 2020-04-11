
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment initialCompared){
        if(this.squares > initialCompared.squares){
            return true;
        } else  {
            return false;
        } 
    }
    
    public int priceDifference(Apartment initialCompared){
        
        int difference = this.princePerSquare * this.squares - initialCompared.princePerSquare * initialCompared.squares;
        
        if(difference < 0){
            return -1 * difference;
        } else {
            return difference;
        }
    }
    
    
    public boolean moreExpensiveThan(Apartment initialCompared){
        
        if(this.squares * this.princePerSquare > initialCompared.squares * initialCompared.princePerSquare){
            return true;
        }
        return false;
    }

}
