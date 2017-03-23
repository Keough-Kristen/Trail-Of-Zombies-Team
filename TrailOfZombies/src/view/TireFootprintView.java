/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.InventoryControlException;
import control.InventoryControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class TireFootprintView {

    private String promptGetHeightMessage;
    private String promptGetWidthMessage;
    
    protected final BufferedReader keyboard = TrailOfZombies.getInFile();
    protected final PrintWriter console = TrailOfZombies.getOutFile();

    public TireFootprintView() {
        this.promptGetHeightMessage = "Enter the height in inches (enter -1 to cancel):";
        this.promptGetWidthMessage = "Enter the width in inches (enter -1 to cancel):";
    }

    public void displayView() {
        int height = 0;
        int width = 0;
        boolean done = false;
        do {

            height =  View.getMenuInt(promptGetHeightMessage);
            if (height == -1) {
                done = true;
            }
            if (!done) {
                width =  View.getMenuInt(promptGetWidthMessage);
                if (width == -1) {
                    done = true;
                }
            }
            if (!done) {

                try {
                    InventoryControl inventoryControl = new InventoryControl();

                    double footprint = inventoryControl.calcTireFootprint(height, width);
                    
               
                       this.console.println("The footprint of the vehicle is " + footprint + ".");
                        done = true;
                    }catch (InventoryControlException ice ) {
                    this.console.println(ice.getMessage());  }

                }

            }
            while (!done);

        }
  

    private int getMenuInt(String prompt) {

       
        String value = "";
        int retval = -1;
        boolean valid = false; //initialize to not valid

        this.console.println("\n" + prompt);

        try {
            value = this.keyboard.readLine();
        } catch (IOException ex) {
           this.console.println("\n*** You must enter a value. ***");
        }
        value = value.trim();

        if (value.length() < 1) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid value: value can not be blank");
            return retval;
        }
        retval = Integer.parseInt(value);

        return retval;

    }

}
