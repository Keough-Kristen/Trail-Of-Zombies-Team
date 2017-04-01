/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.ArrayList;
import model.Game;
import model.Item;
import model.Warehouse;
import model.ItemType;
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
        Game game = TrailOfZombies.getCurrentGame();
        ZombieCrusher zombieCrusher = game.getZombieCrusher();
        ArrayList<Item> zombieCrusherItems = zombieCrusher.getItems();
        
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.food)) {
                this.console.println("You haven't put food in the Zombie Crusher yet. Keep looking!");
    }   
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.weapon)) {
                this.console.println("You haven't put weapons in the Zombie Crusher yet. Keep looking!");
    }      
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.water)) {
                this.console.println("You haven't put water the Zombie Crusher yet. Keep looking!");
    }      
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.fuel)) {
                this.console.println("You don't have enough fuel yet for the Zombie Crusher. Keep looking!");
    }      
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.carparts)) {
                this.console.println("You don't have all the carpart for the Zombie Crusher yet. Keep looking!");
    }      
        if (!GameControl.containsItem(zombieCrusherItems, ItemType.medicine)) {
                this.console.println("You haven't put any medicine in the Zombie Crusher yet. Keep looking!");
    }      
                
        int count = 0;
        if (zombieCrusherItems != null) {

            GameControl.sortItemsByName(zombieCrusherItems);
            for (Item item : zombieCrusherItems) {
                this.console.println(count + " - " + item.getDescription());
                
                count++;
                
                }
            }
         else {
            this.console.println("Your crate is empty.");
        }
         
    }

    private void viewHaven() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


    
  
