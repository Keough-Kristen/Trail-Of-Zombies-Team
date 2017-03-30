/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import control.InventoryControl;
import exceptions.InventoryControlException;
import java.util.ArrayList;
import model.Crate;
import model.Game;
import model.Item;
import model.ItemType;
import model.Warehouse;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class LoadCrateView extends View {
     private ArrayList<Item> warehouseItem;
     private ArrayList<Item> crateItem;
    
     public LoadCrateView(){
            super("\n"
                    + "\n---------------------"
                    + "\n| Let's Load the Crate! |"
                    + "\n---------------------"
                    + "\nP - Pack the crate"
                    + "\nV - View the crate"
                    + "\nQ - Quit"
                    + "\n---------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
    
            switch (value){
                case "P":
                    this.displayPackCrate();
                    break;
                case "V":
                    this.viewCrate();
                    break;
                default:
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    
    private void displayPackCrate() {
        Game game = TrailOfZombies.getCurrentGame();
        Warehouse warehouse = game.getWarehouse();
        warehouseItem = warehouse.getItems();
        
        for (Item item : warehouseItem) {
            if (item.getType() != ItemType.crate) {
            GameControl.moveAllItems(warehouseItem, crateItem);
            
        }
        else {
            
            this.console.println("You don't have the crate yet. Keep looking. ");
    }
        }
    }
    
    private void viewCrate() {
        Game game = TrailOfZombies.getCurrentGame();
        Crate crate = game.getCrate();
        crateItem = crate.getItems();
        
 
        
        int count = 0;
        if (crateItem != null){
           
            GameControl.sortItemsByName(crateItem);
            for(Item item : crateItem){
                this.console.println(count + " - " + item.getDescription());
                
                count++;
            }
        }
        else
            this.console.println("Your crate is empty.");
        
    
    }
    }


    
    
    
    
    /*private void displayFoodCrate() {
      
        int crates = 1;
        ArrayList<Item> warehouseItems = TrailOfZombies.getCurrentGame().getWarehouse().getItems();
        boolean done = false;

        int palletcount = 0;
        int palletPoints = 0;

        for (Item item : warehouseItems) {
            if (item.getType() == ItemType.crate) {
                palletcount++;
                palletPoints += item.getPoints();
            }
        }
        
         if (palletPoints == 2);
         
           
            if (!done) {
                try {
                    InventoryControl inventoryControl = new InventoryControl();

                    double palletPointsNeeded = inventoryControl.calcWoodForCrates(crates, palletPoints);

                    if (palletPointsNeeded == 0) {
                        this.console.println("You don't have any pallets.");
                    }

                    if (palletPointsNeeded < 2) {
                        this.console.println("You need more pallets to build the crate.");
                        if (crates <= 0) {
                            this.console.println("Crates cannot be negative.");
                        }

                    } else {
                        this.console.println("You need " + palletPointsNeeded + " more points to build a crate.");
                        done = true;
                    }
                } catch (InventoryControlException ice) {
                    this.console.println(ice.getMessage());
                }
   
        } while (!done);*/

    

   

