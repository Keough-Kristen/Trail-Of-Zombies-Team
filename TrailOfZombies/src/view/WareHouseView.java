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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean displayUnloadBackpack() {

        ArrayList<Item> warehouseItems = TrailOfZombies.getCurrentGame().getWarehouse().getItems();
        ArrayList<Item> backPackItems = TrailOfZombies.getCurrentGame().getBackPack().getItems();
        Item item;

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
                if (item.getType() != ItemType.crate) {
                    if (GameControl.moveItem(backPackItems, warehouseItems, item)) {
                        this.console.println("You've unloaded the " + item.getDescription() + ".");

                    }
                }
            
        
        


    
        


                /*else {
                    TrailOfZombies.getCurrentGame().getZombiecrusher().setCrate(true);
                    warehouseItems.remove(item);
                }*/
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
    

