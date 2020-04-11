
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int addEuros;
        int addCents;
        
        addEuros = this.euros + addition.euros;
        addCents = this.cents + addition.cents;
        
        Money newMoney= new Money(addEuros,  addCents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if(compared.euros > this.euros){
            return true;
        }
        
        if (compared.euros == this.euros && compared.cents > this.cents){
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser){
        int minusEuros;
        int minusCents;
        
        
        minusEuros = this.euros - decreaser.euros;
        minusCents = this.cents - decreaser.cents;
        
        if(this.cents - decreaser.cents < 0){
            minusEuros--;
            minusCents = 100 - decreaser.cents;
        }
        
        if(minusEuros < 0){
            Money newMoney= new Money(0, 0);
            return newMoney;
        }
        
        Money newMoney= new Money(minusEuros, minusCents);
        
        return newMoney;
    }
}
