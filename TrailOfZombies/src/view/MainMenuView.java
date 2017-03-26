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
public class MainMenuView extends View {

     public MainMenuView () {
         super("\n"
                    + "\n---------------------"
                    + "\n| Main Menu         |"
                    + "\n---------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save game"
                    + ""
                    + "\nQ - Quit"
                    + "\n---------------------");
    }
     @Override
      public boolean doAction(String value) {
           
        value = value.toUpperCase();
    
            switch (value){
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
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(TrailOfZombies.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
                }

    private void startExistingGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file name where the game"
                            + "is saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
         this.console.println("\n\nEnter the file name for file where the game "
                            + "is to be saved.");
         String filePath = this.getInput();
         
         try {
             // save the game to the specified file
             GameControl.saveGame(TrailOfZombies.getCurrentGame(), filePath);
         } catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
    }
}
