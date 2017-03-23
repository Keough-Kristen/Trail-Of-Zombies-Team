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
public class HelpMenuView extends View{

        public HelpMenuView(){
            super("\n"
                    + "\n---------------------"
                    + "\n| Help Menu         |"
                    + "\n---------------------"
                    + "\nG - What is the goal of the game?"
                    + "\nE - Eastimating the amount of resources?"
                    + "\nH - Harvesting resources"
                    + "\nD - Delivering resources to warehouse"
                    + "\nQ - Quit"
                    + "\n---------------------");
    }
    

    @Override
    public boolean doAction(String value) {
           
        value = value.toUpperCase();
    
            switch (value){
                case "G":
                    this.displayGoal();
                    break;
                case "M":
                    this.displayHowToMove();
                    break;
                case "E":
                    this.displayEstimateResources();
                    break;
                case "H":
                    this.displayHarvesting();
                    break;
                case "D":
                    this.displayDelivery();
                    break;
                default:
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }


    private void displayGoal() {
        this.console.println("*** displayGoal function called ***");
    }

    private void displayHowToMove() {
        this.console.println("*** displayHowToMove function called ***");
    }

    private void displayEstimateResources() {
        this.console.println("*** displayEstimateResources function called ***");
    }

    private void displayHarvesting() {
        this.console.println("*** displayHarvesting function called ***");
    }

    private void displayDelivery() {
        this.console.println("*** displayDelivery function called ***");
    }

    


   
}

