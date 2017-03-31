/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Game;
import model.ZombieCrusher;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author brycelaptop
 */
public class ZombieCrusherView extends View{
        
    public ZombieCrusherView() {
        
        super("\n"
                    + "\n---------------------"
                    + "\n| This is our melee vehicle. If you have faith|"
                    + "\n| you will obliterate the path of the wicked. |"
                    + "\n---------------------"
                    + "\nC - Check ZombieCrusher Status"
                    + "\nH - Leave to Haven"
                    + "\nQ - Quit-Go back to Warehouse"
                    + "\n---------------------");
    }

    @Override
    public boolean doAction(String value) {
value = value.toUpperCase();
    
            switch (value){
                case "C":
                    this.displayCrusherStatus();
                    break;
                case "H":
                    this.viewHaven();
                    break;
                default:
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;    }

    private void displayCrusherStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewHaven() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


    
  
