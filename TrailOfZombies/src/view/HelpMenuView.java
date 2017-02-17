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
public class HelpMenuView {

    //private String menu;
    private String promptMessage;
  
    
    public HelpMenuView() {
        this.promptMessage = "\n"
                    + "\n---------------------"
                    + "\n| Help Menu         |"
                    + "\n---------------------"
                    + "\nG - What is the goal of the game?"
                    + "\nE - Eastimating the amount of resources?"
                    + "\nH - Harvesting resources"
                    + "\nD - Delivering resources to warehouse"
                    + "\nQ - Quit"
                    + "\n---------------------";
    }
    
    public void displayHelpMenuView() {
        
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

