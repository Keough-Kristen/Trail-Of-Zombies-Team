/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package view;

import control.GameControl;
import java.util.Scanner;
import model.Scene;
import model.Character;
import model.Map;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class SceneView extends View {
        
        private Scene currentScene;
        
    public SceneView() {
        super("\ndummy scene");
        currentScene = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene();
        
        displayMessage  = "\n---------------------"
                    + "\n| Welcome to " + currentScene + "!|"
                    + "\n---------------------"
                    + "\n Do you want to collect resources. Yes or No"
                    + "\nY - Yes"
                    + "\nQ - No";
    }
    @Override 
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
            switch (value){
                case "Y":
                    this.gatherResources();
                    break;
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
       
       return false;
    }




    private void gatherResources() {
        System.out.println("*** gatherResources function called ***");
    }

   
}
