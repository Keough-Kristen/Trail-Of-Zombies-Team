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
                    System.out.println("\n***Invalid selection *** Try again.");
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
        System.out.println("*** startExistingGame function called ***"); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
         System.out.println("*** saveGame function called ***");
    }
}
