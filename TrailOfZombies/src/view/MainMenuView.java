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
public class MainMenuView {

    //private String menu;
    private String promptMessage;
  
    
    public MainMenuView() {
        this.promptMessage = "\n"
                    + "\n---------------------"
                    + "\n| Main Menu         |"
                    + "\n---------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save game"
                    + "\nQ - Quit"
                    + "\n---------------------";
    }
    
    public void displayMainMenuView() {
        
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
                case "N":
                    this.startNewGame();
                    break;
                case "G":
                    this.startExistingGame();
                    break;
                case "H":
                    this.displayHelpMenu();
                    break;
                case "S":
                    this.saveGame();
                    break;
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(TrailOfZombies.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
                }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***"); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
         System.out.println("*** saveGame function called ***");
    }
}
