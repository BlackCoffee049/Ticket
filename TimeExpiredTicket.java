package assignment13;

/**
 * TimedExpiredTicket.java: a Ticket for a car parked too long in a timed zone or when a 
 * parking meter has no time left and shows the expired flag while the car is there. This type of ticket has a $50 charge.
 * @author V. Miranda-Calleja
 */
public class TimeExpiredTicket extends Ticket {
    
    private double charge;
    //constructor
    public TimeExpiredTicket(){}
    
    public TimeExpiredTicket(String tag,String make, String model, String color){
        super(tag, make, model, color);
        this.charge = 50.00;
    }
    
    public double getExpiredCharge(){
        return this.charge;
    }
    
    @Override
    public String toString(){
        return "Parked in Fire lane Ticket, Charge: $" + this.charge; 
    }
}
