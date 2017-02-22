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
                    + "\nE - Exit"
                    + "\n---------------------";
    }
    
    public void displayGameMenuView() {
        
        boolean done = false;
        do{
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
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
                case "E":
                    this.displayExit();
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

    private void displayExit() {
        System.out.println("*** displayExit function called ***");
    }

    void displayMenu() {
        System.out.println("*** display function called ***");
    }

   
}