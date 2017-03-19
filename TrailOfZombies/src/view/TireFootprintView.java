/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.InventoryControlException;
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
                    
               
                        System.out.println("The footprint of the vehicle is " + footprint + ".");
                        done = true;
                    }catch (InventoryControlException ice ) {
                    System.out.println(ice.getMessage());  }

                }

            }
            while (!done);

        }
  

    private int getMenuInt(String prompt) {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        int retval = -1;
        boolean valid = false; //initialize to not valid

        System.out.println("\n" + prompt);

        value = keyboard.nextLine();
        value = value.trim();

        if (value.length() < 1) {
            System.out.println("\nInvalid value: value can not be blank");
            return retval;
        }
        retval = Integer.parseInt(value);

        return retval;

    }

}
