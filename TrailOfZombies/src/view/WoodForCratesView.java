/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.InventoryControlException;
import control.InventoryControl;
import model.Warehouse;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Item;
import static model.Item.pallet;
import model.ItemType;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author brycelaptop
 */
public class WoodForCratesView {

    private String promptGetNumOfCrates;
    private String promptGetNumOfPallets;

    protected final BufferedReader keyboard = TrailOfZombies.getInFile();
    protected final PrintWriter console = TrailOfZombies.getOutFile();

    public WoodForCratesView() {
        this.promptGetNumOfCrates = "Enter Desired amount of crates.";
        this.promptGetNumOfPallets = "Enter Number of Pallets in inventory.";
    }

    public void displayWoodView() {
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

        do {

            crates = View.getMenuInt(promptGetNumOfCrates);
            if (crates == -1) {
                done = true;
            }
            if (!done) {
                palletPoints = View.getMenuInt(promptGetNumOfPallets);
                if (palletPoints == -1) {
                    done = true;
                }
            }
            if (!done) {
                try {
                    InventoryControl inventoryControl = new InventoryControl();

                    double palletPointsNeeded = inventoryControl.calcWoodForCrates(crates, palletPoints);

                    if (palletPoints == 0) {
                        this.console.println("You don't have any pallets.");
                    }

                    if (palletPointsNeeded < 2) {
                        this.console.println("You need more pallets to build the crate.");
                        if (crates <= 0) {
                            this.console.println("Crates cannot be negative.");
                        }

                    } else {
                        this.console.println("You need " + palletPointsNeeded + " more pallets.");
                        done = true;
                    }
                } catch (InventoryControlException ice) {
                    this.console.println(ice.getMessage());
                }
            }

        } while (!done);

    }
}
