/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

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

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        //while a valid name has not been retrieved
        while (!valid) {

            //prompt for the player's name
            System.out.println("\n" + this.displayMessage);

            //get the valye entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) { //blank value entered
                System.out.println("\n*** Yout must enter a value. *** ");
                continue;
            }
            break;
        }
        return value; //return the name
    }

    public static int getMenuInt(String prompt) {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        int retval = -999;
        boolean valid = false; //initialize to not valid
        do {
            System.out.println("\n" + prompt + "(enter Q to cancel):");

            value = keyboard.nextLine();
            value = value.trim().toUpperCase();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");

            } else {
                if (value == "Q")
                    return -1;
                
                try {
                    retval = Integer.parseInt(value);

                } catch (NumberFormatException nf) {
                    System.out.println("\n You must enter a valid number."
                            + "\n Try again.");
                }
            }
        } while (retval == -999);

        return retval;

    }
}
