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
public class GameMenuView {

    //private String menu;
    private String promptMessage;
  
    
    public GameMenuView() {
        this.promptMessage = "\n"
                    + "\n---------------------"
                    + "\n| Game Menu         |"
                    + "\n---------------------"
                    + "\nL - Location Menu"
                    + "\nR - Eastimating the amount of resources?"
                    + "\nK - Welcome to the Haven"
                    + "\nH - Harvest Menu"
                    + "\nV - Get Crate Volume"
                    + "\nG - How many gallons do you need?"
                    + "\nE - Exit"
                    + "\n---------------------";
    }
    
    public void displayGameMenuView() {
        
        boolean done = false;
        do{
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    
    }  

    private String getMenuOption() {
        
       Scanner keyboard = new Scanner(System.in);
       String value ="";
       boolean valid = false; //initialize to not valid
       
       while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
       }
      
    return value;
    
    }
    
    public boolean doAction(String choice) {
           
        choice = choice.toUpperCase();
    
            switch (choice){
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
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void displayLocationMenu() {
        LocationMenuView locationMenu = new LocationMenuView();
        locationMenu.displayLocationMenuView();
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

   
}