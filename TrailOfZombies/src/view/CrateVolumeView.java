/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exceptions.InventoryControlException;
import control.InventoryControl;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brycelaptop
 */
public class CrateVolumeView {
     private String promptGetHeightMessage;
     private String promptGetWidthMessage;
     private String promptGetDepthMessage;

    public CrateVolumeView() {
        this.promptGetHeightMessage = "Enter the height in inches (enter -1 to cancel):";
        this.promptGetWidthMessage = "Enter the width in inches (enter -1 to cancel):";
        this.promptGetDepthMessage = "Enter the depth in inches (enter -1 to cancel):";
    }
     public void displayVolumeView() {
        int  depth= 0;
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
              depth = this.getMenuInt(promptGetDepthMessage);
              if (depth == -1)
                  done = true;
            }
            if (!done){
                try {
                    InventoryControl inventoryControl = new InventoryControl();
                    
                    double volume = inventoryControl.calcVolumeOfCrate(height, width, depth);
                    if (volume < 0){
                        //to do output error message(s)
                        
                   /*     if (height < 0){
                            System.out.println("Height cannot be negative.");}
                        
                        
                        else if (width < 0){
                            System.out.println("Width cannot be negative.");}
                        
                        
                        else if (depth < 0 || depth > 48){
                            System.out.println("Depth is out of range.");}
                     */   
                    }
                    
                    else {
                        System.out.println("The volume of the crate is " + volume + " cubic feet.");
                         done = true;
                    }
                } catch (InventoryControlException ice) {
                    System.out.println(ice.getMessage());                }
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
