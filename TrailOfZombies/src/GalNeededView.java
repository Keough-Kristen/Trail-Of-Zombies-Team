import control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class GalNeededView {
     private String promptGetMilesMessage;
     private String promptGetMpgMessage;
     private String promptGetGallonsMessage;
     

    public GalNeededView() {
        this.promptGetMilesMessage = "How many miles do you want to travel?(Enter -1 to cancel)";
        this.promptGetMpgMessage = "How many miles per gallon do you think you can get?(Enter -1 to cancel)";
        this.promptGetGallonsMessage = "How many gallons have you collected?(Enter -1 to cancel)";
    }
     public void displayGalView() {
        int  miles = 0;
        int mpg = 0;
        int gallons = 0;
        boolean done = false;
        do{
        
            miles = this.getMenuInt(promptGetMilesMessage);
            if (miles == -1){
                 done = true;
            }
                    
            if (!done){
              mpg = this.getMenuInt(promptGetMpgMessage);
              if (mpg == -1)
                  done = true;
            }
            if (!done){
              gallons = this.getMenuInt(promptGetGallonsMessage);
              if (gallons == -1)
                  done = true;
            }
            if (!done){
                InventoryControl inventoryControl = new InventoryControl();
                        
                double gal = inventoryControl.calcGalNeeded(miles, mpg, gallons);
                if (gal < 0){
                    //to do output error message(s)
                    
                   if (miles < 0){ 
                      System.out.println("Miles cannot be negative.");}
                   
                   
                   else if (gallons < 0){
                       System.out.println("Gallons cannot be negative.");}
                      
                   
                    else if (mpg < 0 || mpg > 48){
                       System.out.println("MPG is out of range.");}
                   
            }
               
                else {
                    System.out.println("Based on your inputs you will need " + gal + " gallons to go your distance .");
                done = true;
                }
            }
        } while (!done);
        
    
    }  

    private int getMenuInt(String prompt) {
        
       Scanner keyboard = new Scanner(System.in);
       String value ="";
       int retval = -1;
       boolean valid = false; //initialize to not valid
       
            System.out.println("\n" + prompt);
            
            value = keyboard.nextLine();
            value = value.trim();
           
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                return retval;
            }
             retval = Integer.parseInt(value);
        
    return retval;
    
    }
    
}

