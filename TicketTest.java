
package assignment13;

/**
* TicketTest.java: Calls classes to construct and display different types of tickets
* @author V. Miranda-Calleja
 */
public class TicketTest {
    public static void main(String[] args) {
        TimeExpiredTicket ticket1 = new TimeExpiredTicket("PAT-8379", "Toyota", "Camry", "Blue");
        HandicappedTicket ticket2 = new HandicappedTicket("JRT-4523", "Tesla", "Model X", "White");
        FirelaneTicket ticket3 = new FirelaneTicket("COD-6742", "Ford", "F-150 Raptor", "Red");
        
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
    }
}
