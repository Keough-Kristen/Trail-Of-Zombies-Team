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
public class GameMenuView extends View {
    
    public GameMenuView() {
         super("\n"
                    + "\n---------------------"
                    + "\n| Game Menu         |"
                    + "\n---------------------"
                    + "\nL - Location Menu"
                    + "\nR - Eastimating the amount of resources?"
                    + "\nK - Welcome to the Haven"
                    + "\nH - Harvest Menu"
                    + "\nV - Get Crate Volume"
                    + "\nG - How many gallons do you need?"
                    + "\nF - Get Tire Footprint"
                    + "\nN - Start New Game"
                    + "\nE - Exit"
                    + "\n---------------------");
    }
 
    @Override
    public boolean doAction(String value) {
           
        value = value.toUpperCase();
    
            switch (value){
                case "L":
                    this.displayLocationMenu();
                    break;
                case "R":
                    this.displayResources();
                    break;
                case "K":
                    this.displayGoToHaven();
                    break;
                case "H":
                    this.displayHarvest();
                    break;
                case "V":
                    this.displayVolume();
                    break;    
                case "G":
                    this.displayGallons();
                    break;  
                case "F":
                    this.displayFootprint();
                    break; 
                case "N":
                    this.startNewGame();
                    break; 
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void displayLocationMenu() {
        LocationMenuView locationMenu = new LocationMenuView();
        locationMenu.display();
    }

    private void displayResources() {
        System.out.println("*** displayResources function called ***");
    }

    private void displayGoToHaven() {
        System.out.println("*** displayGoToHaven function called ***");
    }

    private void displayHarvest() {
        System.out.println("*** displayHarvest function called ***");
    }

    void displayMenu() {
        System.out.println("*** display function called ***");
    }

    private void displayVolume() {
        CrateVolumeView crateVolume = new CrateVolumeView();
        crateVolume.displayVolumeView();
        }


    private void displayGallons() {
     GalNeededView  galNeeded = new GalNeededView();
        galNeeded.displayGalView();
        }


    private void displayFootprint() {
        TireFootprintView tireFootprint = new TireFootprintView();
        tireFootprint.displayFootprintView();
    }

    private void startNewGame() {
         GameControl.createNewGame(TrailOfZombies.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
                }

  
}
