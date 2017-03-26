/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.InventoryControl;
import exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author Marco
 */
public class GalNeededView {
     private String promptGetMilesMessage;
     private String promptGetGallonsMessage;
     
    protected final BufferedReader keyboard = TrailOfZombies.getInFile();
    protected final PrintWriter console = TrailOfZombies.getOutFile();

    public GalNeededView() {
        this.promptGetMilesMessage = "How many miles do you want to travel?(Enter -1 to cancel)";
        this.promptGetGallonsMessage = "How many gallons have you collected?(Enter -1 to cancel)";
    }
     public void displayGalView() {
        int  tmiles = 0;
        int gallons = 0;
        boolean done = false;
        do{
        
            tmiles = this.getMenuInt(promptGetMilesMessage);
            if (tmiles == -1){
                 done = true;
            }
                    
            if (!done){
              gallons = this.getMenuInt(promptGetGallonsMessage);
              if (gallons == -1)
                  done = true;
            }
            
             if (!done){
              gallons = this.getMenuInt(promptGetGallonsMessage);
              if (gallons <= 0)
                  done = true;
            }
            if (!done){
                try{
                InventoryControl inventoryControl = new InventoryControl();
                        
                double NeededGal = inventoryControl.calcGalNeeded(tmiles, gallons);
                if (NeededGal <= 0){
                    //to do output error message(s)
                    
                   if (tmiles <= 0){ 
                      this.console.println("Miles cannot be 0 or less.");}
                   
                   
                   else if (gallons <= 0){
                       this.console.println("Gallons cannot be 0 or less.");}
                   
            }
               
                else {
                    this.console.println("Based on your inputs you will need " + NeededGal + " gallons to travel this distance .");
                done = true;
                }
                }catch(InventoryControlException ice){
                    this.console.println(ice.getMessage());  
                }
            }
        } while (!done);
        
    
    }  

    private int getMenuInt(String prompt) {
        
       
       String value ="";
       int retval = -1;
       boolean valid = false; //initialize to not valid
       
            this.console.println("\n" + prompt);
            
         try {
             value = this.keyboard.readLine();
         } catch (IOException ex) {
             this.console.println("\n*** You must enter a value. ***");
         }
            value = value.trim();
           
            if (value.length() < 1){
                this.console.println("\nInvalid value: value can not be blank");
                return retval;
            }
             retval = Integer.parseInt(value);
        
    return retval;
    
    }
    
}


