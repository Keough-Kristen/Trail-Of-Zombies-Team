/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
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
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = TrailOfZombies.getInFile();
    protected final PrintWriter console = TrailOfZombies.getOutFile();

    
    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the view
            }
            //do the requested action and display the next view
            done = this.doAction(value);

        } while (!done); //exit the view when done == true
    }

    @Override
    public String getInput() {

        
        boolean valid = false;
        String value = null;

        //while a valid name has not been retrieved
        while (!valid) {

            //prompt for the player's name
            this.console.println("\n" + this.displayMessage);

            try {
                //get the valye entered from the keyboard
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                        "*** You must enter a value. ***");
            }
            value = value.trim();

            if (value.length() < 1) { //blank value entered
                ErrorView.display(this.getClass().getName(),
                        "*** You must enter a value. *** ");
                continue;
            }
            break;
        }
        return value; //return the name
    }

    public static int getMenuInt(String prompt) {

        final BufferedReader keyboard = TrailOfZombies.getInFile();
        final PrintWriter console = TrailOfZombies.getOutFile();
        
        String value = "";
        int retval = -999;
        boolean valid = false; //initialize to not valid
        do {
            console.println("\n" + prompt + "enter Q to cancel:");

            try {
                value = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                return retval;
                
            }
            value = value.trim().toUpperCase();

            if (value.length() < 1) {
                ErrorView.display("View Class",
                        "Invalid value: value can not be blank");

            } else {
                if (value == "Q")
                    return -1;
                
                try {
                    retval = Integer.parseInt(value);

                } catch (NumberFormatException nf) {
                    ErrorView.display("View Class",
                            "You must enter a valid number."
                            + "Try again.");
                }
            }
        } while (retval == -999);

        return retval;

    }
}
