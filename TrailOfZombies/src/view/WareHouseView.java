/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Item;
import trailofzombies.TrailOfZombies;
import model.BackPack;
import model.Item;
import model.Warehouse;
import control.BackPackControl;
import control.GameControl;
import java.util.ArrayList;
import model.Game;
import model.ItemType;
import view.ZombieCrusherView;

/**
 *
 * @author brycelaptop
 */
public class WareHouseView extends View {

    public WareHouseView() {

        super("\n"
                + "\n---------------------"
                + "\n| Welcome to the Warehouse!|"
                + "\n---------------------"
                + "\nI - View Inventory"
                + "\nB - View BackPack"
                + "\nK - Welcome to the Haven."
                + "\nZ - View Zombie Crusher."
                + "\nC - Load Crate."
                + "\nL - Unload Items from Backpack."
                + "\nQ - Exit to previous menu.");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "I":
                this.displayInventory();
                break;
            case "B":
                this.viewBackPack();
                break;
            case "K":
                this.displayHaven();
                break;
            case "Z":
                this.displayZombieCrusher();
                if (TrailOfZombies.getCurrentGame().isGameOver())
                        return true;
                break;
            case "C":
                this.displayLoadCrate();
                break;
            case "L":
                this.displayUnloadBackpack();
                break;
            default:
                this.console.println("\n***Invalid selection *** Try again.");
                break;
        }
        return false;

    }

    private void displayInventory() {
        Game game = TrailOfZombies.getCurrentGame();
        Warehouse warehouse = game.getWarehouse();
        ArrayList<Item> warehouseItems = warehouse.getItems();

        int count = 0;
        if (warehouseItems != null) {

            GameControl.sortItemsByName(warehouseItems);
            for (Item item : warehouseItems) {
                this.console.println(count + " - " + item.getDescription());

                count++;
            }
        } else {
            this.console.println("Your WareHouse is empty.");
        }
//something
    }

    private void displayHaven() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayZombieCrusher() {
        ZombieCrusherView zombieCrusher = new ZombieCrusherView();
        zombieCrusher.display();
    }

    private boolean displayUnloadBackpack() {

        ArrayList<Item> zombieCrusherItems = TrailOfZombies.getCurrentGame().getZombieCrusher().getItems();
        ArrayList<Item> backPackItems = TrailOfZombies.getCurrentGame().getBackPack().getItems();
        Item item;
        if (!TrailOfZombies.getCurrentGame().getZombieCrusher().hasCrate()) {
            if (!GameControl.containsItem(backPackItems, ItemType.crate)) {
                this.console.println("Crate is not in backpack or Zombie Crusher. Keep looking!");
                return false;
            }
            GameControl.removeItem(backPackItems, ItemType.crate);
            TrailOfZombies.getCurrentGame().getZombieCrusher().setCrate(true);
            this.console.println("You've found the crate and it has been loaded into the Zombie Crusher.");
        }
        viewBackPack();

        boolean done = false;

        int choice = -1;
        //String input = getMenuInt();

        do {

            choice = View.getMenuInt("Choose an Item to remove from your backpack. (Enter -1 to cancel.)");

            if (choice == -1) {
                done = true;
            }

            if (choice < 0 || choice >= backPackItems.size()) {
                ErrorView.display(this.getClass().getName(),
                        "Your choice is invalid.");
                return true;
            } else {
                item = backPackItems.get(choice);
            }
            //this.displayMessage = savePrompt;

            if ((!done) && (item != null)) {

                if (GameControl.moveItem(backPackItems, zombieCrusherItems, item)) {
                    this.console.println("You've unloaded the " + item.getDescription() + ".");

                }
            }
            return false;
        } while (!done);

    }

    
    private void viewBackPack() {
        Game game = TrailOfZombies.getCurrentGame();
        BackPack backpack = game.getBackPack();
        ArrayList<Item> backPackItems = backpack.getItems();

        int count = 0;
        if (backPackItems != null) {

            GameControl.sortItemsByName(backPackItems);
            for (Item item : backPackItems) {
                this.console.println(count + " - " + item.getDescription());

                count++;
            }
        } else {
            this.console.println("Your backpack is empty.");
        }

    }

    private void displayLoadCrate() {
        Game game = TrailOfZombies.getCurrentGame();
        Warehouse warehouse = game.getWarehouse();
        ArrayList<Item> warehouseItems = warehouse.getItems();

        for (Item item : warehouseItems) {
            if (item.getType() == ItemType.crate) {
                LoadCrateView loadCrateView = new LoadCrateView();
                loadCrateView.display();

            } else {

                this.console.println("You don't have the crate yet. Keep looking. ");
            }
        }
    }
}
