/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package view;

import control.GameControl;
import model.Game;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class TravelToNewLocationView extends View {

    public TravelToNewLocationView() {
        super("\nEnter a Row number from the map.");
        
    }
   
    
   @Override 
    public boolean doAction(String value) {
       try{
       int rowNumber = Integer.parseInt(value);
        
        if (rowNumber < 0 || rowNumber > 4){
       ErrorView.display(this.getClass().getName(),
                     "Invalid row number: "
                   + "The row must be 0-4.");
       
       return false;
        }
        displayMessage = "\nEnter a column number from the map.";
        value = getInput();
        int columnNumber = Integer.parseInt(value);
        
        while (columnNumber < 0 || columnNumber > 4){
            ErrorView.display(this.getClass().getName(),
                     "Invalid column number: "
                   + "The column must be 0-4.");
            value = getInput();
            columnNumber = Integer.parseInt(value);
             }        
        
        Game game = TrailOfZombies.getCurrentGame();
        GameControl.movePlayer(game.getMap(),rowNumber,columnNumber);
        
       }catch(NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                                 "You must enter a valid number."
                                + "try again or enter Q to Quit");
            }
        
       
       return true;
    
    }    
        

      
}
     