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
public class BigJimsPigFarmMenuView extends View {

    public BigJimsPigFarmMenuView() {
        super("\n"
                    + "\n---------------------"
                    + "\n| Welcome to Big Jim's Pig Farm.|"
                    + "\n---------------------"
                    + "\nY - Would you like to gather the resources available at this location? "
                    + "\nX - Return to location menu"
                    + "\nH - Display Help Menu"
                    + "\nQ - Quit"
                    + "\n---------------------");
    }
   @Override 
    public boolean doAction(String value) {
           
        value = value.toUpperCase();
    
            switch (value){
                case "Y":
                    this.gatherResources();
                    break;
                case "X":
                    this.returnToLocationMenu();
                    break;
                case "H":
                    this.displayHelpMenu();
                    break;
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }


    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void gatherResources() {
        System.out.println("*** gatherResources function called ***");
    }

    private void returnToLocationMenu() {
        LocationMenuView locationMenu = new LocationMenuView();
        locationMenu.display();
    }

   
}
