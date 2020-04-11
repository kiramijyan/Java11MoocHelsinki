
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int initDay, int initMonth, int initYear) {
        this.day = initDay;
        this.month = initMonth;
        this.year = initYear;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }
    
    public void advance(){
       
        this.day++;   
        
        if(this.day > 30){
            this.month++;
            this.day = 1;
        }
        
        if(this.month > 12){
            this.year++;
            this.month = 1;
        }    
    }
    
    
    public void advance(int howManyDays){
        for(int i = 0; i < howManyDays; i++){
            advance();
        }
    }
    
    
    public SimpleDate afterNumberOfDays(int days){
        
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.advance(days);
        
        return newDate;
    }
}
