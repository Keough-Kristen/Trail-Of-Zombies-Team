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
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }


    private void displayGoal() {
        System.out.println("*** displayGoal function called ***");
    }

    private void displayHowToMove() {
        System.out.println("*** displayHowToMove function called ***");
    }

    private void displayEstimateResources() {
        System.out.println("*** displayEstimateResources function called ***");
    }

    private void displayHarvesting() {
        System.out.println("*** displayHarvesting function called ***");
    }

    private void displayDelivery() {
        System.out.println("*** displayDelivery function called ***");
    }

    void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}

