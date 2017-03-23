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
import java.util.Scanner;
import trailofzombies.TrailOfZombies;


/**
 *
 * @author brycelaptop
 */
public class CrateVolumeView {
     private String promptGetHeightMessage;
     private String promptGetWidthMessage;
     private String promptGetDepthMessage;
     
     protected final BufferedReader keyboard = TrailOfZombies.getInFile();
     protected final PrintWriter console = TrailOfZombies.getOutFile();

    public CrateVolumeView() {
        this.promptGetHeightMessage = "Enter the height in inches";
        this.promptGetWidthMessage = "Enter the width in inches";
        this.promptGetDepthMessage = "Enter the depth in inches";
    }
   
     public void displayView() {
        int  depth= 0;
        int height = 0;
        int width = 0;
        boolean done = false;
        do{
            
            height = View.getMenuInt(promptGetHeightMessage);
            if (height == -1)
                done = true;
            if (!done){
              width = View.getMenuInt(promptGetWidthMessage);
              if (width == -1)
                  done = true;
            }
            if (!done){
              depth = View.getMenuInt(promptGetDepthMessage);
              if (depth == -1)
                  done = true;
            }
            if (!done){
                
                try {
                    InventoryControl inventoryControl = new InventoryControl();
                 
                    double volume = inventoryControl.calcVolumeOfCrate(height, width, depth);
                    
                        this.console.println("The volume of the crate is " + volume + " cubic feet.");
                         done = true;
                    
                } catch (InventoryControlException ice ) 
                {
                    this.console.println(ice.getMessage());  }
            }
        } while (!done);
        
        
    }  

}
