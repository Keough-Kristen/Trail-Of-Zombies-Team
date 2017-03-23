/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.InventoryControlException;
import control.InventoryControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author brycelaptop
 */
public class WoodForCratesView {

    private String promptGetNumOfCrates;
    private String promptGetNumOfPallets;
    
    protected final BufferedReader keyboard = TrailOfZombies.getInFile();
    protected final PrintWriter console = TrailOfZombies.getOutFile();
    
    

    public WoodForCratesView() {
        this.promptGetNumOfCrates = "Enter Desired amount of crates.";
        this.promptGetNumOfPallets = "Enter Number of Pallets in inventory.";
    }

    public void displayWoodView() {
        int crates = 0;
        int pallets = 0;
        boolean done = false;
        do{
            
            crates = View.getMenuInt(promptGetNumOfCrates);
            if (crates == -1)
                done = true;
            if (!done){
              pallets = View.getMenuInt(promptGetNumOfPallets);
              if (pallets == -1)
                  done = true;
            }
            if (!done){
                try{
                InventoryControl inventoryControl = new InventoryControl();
                        
                double palletsNeeded = inventoryControl.calcWoodForCrates(crates, pallets);
                if (palletsNeeded < 0){
                    //to do output error message(s)
                    
                   if (crates <= 0){ 
                      this.console.println("Crates cannot be negative.");}
                   
                   
                   else if (pallets<=0){
                       this.console.println("Pallets cannot be negative."); }        
            }
                
                else {
                    this.console.println("You need " + palletsNeeded + " more pallets.");
                done = true;
                }
                }catch (InventoryControlException ice ) 
                {
                    this.console.println(ice.getMessage());  }
            }
            
            
            }while (!done);
        
    }
}
