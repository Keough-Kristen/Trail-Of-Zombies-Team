/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author kristenkeough
 */
public class TireFootprintView {
     private String promptGetHeightMessage;
     private String promptGetWidthMessage;
    
    public TireFootprintView() {
        this.promptGetHeightMessage = "Enter the height in inches (enter -1 to cancel):";
        this.promptGetWidthMessage = "Enter the width in inches (enter -1 to cancel):";
    }
     public void displayFootprintView() {
        int height = 0;
        int width = 0;
        boolean done = false;
        do{
            
            height = this.getMenuInt(promptGetHeightMessage);
            if (height == -1)
                done = true;
            if (!done){
              width = this.getMenuInt(promptGetWidthMessage);
              if (width == -1)
                  done = true;
            }
            if (!done){
                InventoryControl inventoryControl = new InventoryControl();
                        
                double footprint = inventoryControl.calcTireFootprint(height, width);
                if (footprint < 0){
                    //to do output error message(s)
                    
                   if (width < 0){ 
                      System.out.println("Width cannot be negative.");}
                   
                   
                   else if (height<0 || height>30){
                       System.out.println("Height cannot be negative."); }        
            }
                
                else {
                    System.out.println("The footprint of the vehicle is " + footprint + ".");
                done = true;
                }
            }
            
            }while (!done);
        
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

