/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.InventoryControl;
import exceptions.InventoryControlException;
import java.util.ArrayList;
import model.Item;
import model.ItemType;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class BuildCrateView extends View {
    
     public BuildCrateView(){
            super("\n"
                    + "\n---------------------"
                    + "\n| Let's Build a Crate! |"
                    + "\n---------------------"
                    + "\nF - Food Crate"
                    + "\nW - Weapon Crate"
                    + "\nA - Water Crate"
                    + "\nM - Medicine Crate"
                    + "\nQ - Quit"
                    + "\n---------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
    
            switch (value){
                case "F":
                    this.displayFoodCrate();
                    break;
                case "W":
                    this.displayWeaponCrate();
                    break;
                case "A":
                    this.displayWaterCrate();
                    break;
                case "M":
                    this.displayMedicineCrate();
                    break;
                default:
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void displayFoodCrate() {
      
        int crates = 1;
        ArrayList<Item> warehouseItems = TrailOfZombies.getCurrentGame().getWarehouse().getItems();
        boolean done = false;

        int palletcount = 0;
        int palletPoints = 0;

        for (Item item : warehouseItems) {
            if (item.getType() == ItemType.pallet) {
                palletcount++;
                palletPoints += item.getPoints();
            }
        }
        
         if (palletPoints == 2);
         
           /*
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

    }

    private void displayWeaponCrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayWaterCrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMedicineCrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
