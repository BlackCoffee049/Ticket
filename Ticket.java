package assignment13;

/**
 * Ticket.java: Base Class/Super class that contains the tag, make, model, color values. INHERITANCE
 * @author V. Miranda-Calleja
 */
public class Ticket {
    private String tag;
    private String make;
    private String model;
    private String color;
    
    //constructors
   public Ticket(){}
    
    public Ticket(String tag, String make, String model, String color){
        this.tag = tag;
        this.make = make;
        this.model = model;
        this.color = color;
    }
    
    //setters/getters
    public void setTag(String t){
        this.tag = t;
    }
    
    public void setMake(String ma){
        this.make = ma;
    }
    
    public void setModel(String mo){
        this.model = mo;
    }
    
    public void setColor(String co){
        this.color = co;
    }
    
    public String getTag(){
        return tag;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        return "Tag: " + tag + "\nMake: " + this.make + "\nModel: " + this.model + "\nColor: " + this.color;
    }
}
