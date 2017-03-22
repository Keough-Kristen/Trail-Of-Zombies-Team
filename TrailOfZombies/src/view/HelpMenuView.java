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
                    + "\nH - Collecting resources"
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
                    this.displayCollecting();
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
        System.out.println("\n***********************"
                + "\n* The goal of the game is simple. You need to travel*"
                + "\n* to each location on the Map and look for resources. Bring the*"
                + "\n* resources back to the Warehouse where you will build crates to*"
                + "\n* store your resources. Put the items inside the crates and load*"
                + "\n* them onto the Zombie Crusher. The Zombie Crusher requires some*"
                + "\n* upgrades before it is ready to go. Once the Zombie Crusher is*"
                + "\n* complete and you have loaded all the resources into it, you can*"
                + "\n* leave to Haven. If you think you are ready to leave select K in*"
                + "\n* the Game Menu. If you do not have enough resources then you will*"
                + "\n* not make it to Haven.*");
    }

    private void displayHowToMove() {
        System.out.println("\n*You can look at the Map by selecting M in the Game Menu. *"
                + "\n*The Map will display the places you've visited and where you are. *"
                + "\n*Once you know where you want to go select the T (travel to new location) *"
                + "\n*option in the Game Menu. You will be prompted for the Row and *"
                + "\n*Column of the destination of your choice. You are at a new location.*");
    }

    private void displayEstimateResources() {
        System.out.println("\n*If you need to see how many more resources you need *"
                + "\n*go to the Game Menu and select I. This will show you how many *"
                + "\n*of each resource you have and how many you still need.*");
    }

    private void displayCollecting() {
        System.out.println("\n*To collect resources you need to travel to the different *"
                + "\n*locations on the map. At each location you can Add items to the *"
                + "\n*Backpack. You can also interact with the Characters at the location. *"
                + "\n*Some of the characters will give you resources you need.*");
    }

    private void displayDelivery() {
        System.out.println("\n*After you've collected the resources from a scene *"
                + "\n*they are stored in your Backpack. To move the resources to the *"
                + "\n*warehouse you need to travel to the warehouse. You can then choose *"
                + "\n*to remove the item(s) from the Backpack and store them at the *"
                + "\n*Warehouse.*");
    }

   
}

