
package assignment13;

/**
*  FirelaneTicket.java: A Ticket for a car parked in fire lane or beside a fire hydrant.
* This type of ticket has a $150 charge.
 * @author Black
 */
public class FirelaneTicket extends Ticket {
    private double charge;
    
    public FirelaneTicket(){}
    
    public FirelaneTicket(String tag, String make, String model, String color){
        super(tag, make, model, color);
        this.charge = 150.00;
    }
    
    public double getFireCharge(){
        return this.charge;
    }
    
    @Override
    public String toString(){
        return "Time Expired Ticket, Charge: $" + this.charge;
    }    
}
