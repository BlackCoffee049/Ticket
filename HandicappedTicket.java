package assignment13;

/**
 * HandicappedTicket.java: A Ticket for a car parked in a handicapped zone with no handicapped 
 * permit on it. This type of ticket has a $100 charge. 
 * @author V. Miranda-Calleja
 */
public class HandicappedTicket extends Ticket {
    private double charge;
    
    //constructors
    public HandicappedTicket(){}
    
    public HandicappedTicket(String tag, String make, String model, String color){
        super(tag, make, model, color);
        this.charge = 100.00;
    }
    
    public double getHandiCharge(){
        return this.charge;
    }
    
    @Override
    public String toString(){
        return "Parked in Handicapped Ticket, Charge: $" + this.charge;
    }
}
