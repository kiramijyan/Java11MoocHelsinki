
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
         this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        // implethis.balancement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        
        if(this.balance >= amount){
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        if(this.balance <= card.balance){
            card.balance = card.balance - 2.50;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        if(this.balance <= card.balance){
            card.balance = card.balance - 2.50;
            return true;
        } else {
            return false;
        }
    }
}
