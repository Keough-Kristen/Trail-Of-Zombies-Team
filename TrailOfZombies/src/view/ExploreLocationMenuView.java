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
public class ExploreLocationMenuView {

    //private String menu;
    private String promptMessage;
  
    
    public ExploreLocationMenuView() {
        this.promptMessage = "\n"
                    + "\n---------------------"
                    + "\n| Welcome to___________.|"
                    + "\n---------------------"
                    + "\nY - Would you like to gather the resources available at this location? "
                    + "\nN - Return to Location Menu"
                    + "\nH - Display Help Menu"
                    + "\nQ - Quit"
                    + "\n---------------------";
    }
    
    public void displayExploreLocationMenuView() {
        
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
                case "Y":
                    this.gatherResources();
                    break;
                case "N":
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
        helpMenu.displayHelpMenuView();
    }

    private void gatherResources() {
        System.out.println("*** gatherResources function called ***");
    }

    private void returnToLocationMenu() {
        System.out.println("*** returnToLocationMenu function called ***");
    }


   
}

