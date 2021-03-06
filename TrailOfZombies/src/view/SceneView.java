/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.GameControlException;
import control.GameControl;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import model.Scene;
import model.Item;
import model.Character;
import model.Map;
import model.Game;
import model.Location;
import model.BackPack;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class SceneView extends View {

    private Scene currentScene;
    private ArrayList<Item> sceneItems;
    private Character sceneCharacter;
    private ArrayList<Item> backPackItems;

    public SceneView() {
        super("\ndummyscene");
        currentScene = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene();
        sceneItems = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene().getItems();
       // int count = sceneItems.size();

        /*if (currentScene.getName() == "Warehouse") {
            WareHouseView wareHouse = new WareHouseView();
            wareHouse.display();
        } else */
        {

            displayMessage = "\n---------------------"
                    + "\n| Welcome to " + currentScene.getName() + "!|"
                    + "\n---------------------"
                    + "\nR - Resources at this location:"
                    + "\nC - View character(s) at this location."
                    + "\nB - View resource in your backpack."
                    + "\nA - Add Items to your backpack"
                    + "\nQ - Exit to previous menu.";
        }
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "R":
                this.locationResources();
                break;
            case "C":
                this.viewCharacters();
                if (TrailOfZombies.getCurrentGame().isGameOver()) {
                    return true;
                }
                break;

            case "B":
                this.viewBackPack();
                break;
            case "A":
                this.gatherResources();
                break;
            default:
                this.console.println("\n***Invalid selection *** Try again.");
                break;
        }

        return false;
    }

    private void locationResources() {
        sceneItems = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene().getItems();
        int count = 0;
        if (sceneItems != null) {

            GameControl.sortItemsByDescending(sceneItems);
            for (Item item : sceneItems) {
                this.console.println(count + " - " + item.getDescription());

                count++;
            }
        }

    }

    private void viewCharacters() {
        sceneCharacter = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene().getCharacter();

        if (sceneCharacter == model.Character.John
                || sceneCharacter == model.Character.Eric
                || sceneCharacter == model.Character.Zeek
                || sceneCharacter == model.Character.Marilyn
                || sceneCharacter == model.Character.Dan
                || sceneCharacter == model.Character.AnneOakley
                || sceneCharacter == model.Character.Mike
                || sceneCharacter == model.Character.Vicki
                || sceneCharacter == model.Character.DocHoliday) {
            this.console.println(sceneCharacter + " is here.");
        } else if (sceneCharacter == model.Character.OldLadyZombie
                || sceneCharacter == model.Character.BikerZombie
                || sceneCharacter == model.Character.CopZombie
                || sceneCharacter == model.Character.MidgetZombie) {
            this.console.println(sceneCharacter + " is here."
                    + "\n			       __                                   "
                    + "\n			         |                 |                "
                    + "\n			     |   /     zoombieeee\\__/,----_        "
                    + "\n			     |  | ah*           `    °/°/,          "
                    + "\n	                     oo'                __          \\  ,   "
                    + "\n	                “””i/          ,;  ,‘ °`            ,\\/    "
                    + "\n	                ;-//   __  ---°  _/                   \\    "
                    + "\n	                 //       °°°°°°         p mmmq       _\\_  "
                    + "\n	                //                      //      \\      }}  "
                    + "\n	                \\ _-----_             /          \\  _  }}  "
                    + "\n	                 /        \\          |       0   }}  l }   "
                    + "\n	                {   0      }} _   _   \\          }}  | |_  "
                    + "\n	                \\,       //  O   O    \\         /°   °/°°°"
                    + "\n	                 /~~~~~~~°°/           |_°~~~~~~~°  /  /    "
                    + "\n	                 \\   ,---brraaaaaainns,,          /__/     "
                    + "\n	                   °°°°°--/  |°°|  \\~\\_^\\      / / |     "
                    + "\n	                          ----  °°°°  _-- ,|\\    /\\ /     "
                    + "\n	                        / \\~|__/__/|__|l   /    /--        "
                    + "\n	                       |___________________/    /           "
                    + "\n	                          |___________°°,,°|___/            "
                    + "\n	                              °)°)°°°                       "
                    + "\n ----------------------------------------------------------------"
                    + "\n------------------- YOU HAVE BEEN EATEN--------------------------"
                    + "\n Game is over!  You will be redirected to the main menu.");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
            }

            TrailOfZombies.getCurrentGame().setGameOver(true);
        } else if (sceneCharacter == null) {

            this.console.println("There isn't a character at this location.");

        }
    }

    private void viewBackPack() {
        Game game = TrailOfZombies.getCurrentGame();
        BackPack backpack = game.getBackPack();
        backPackItems = backpack.getItems();

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

    private boolean gatherResources() {
        sceneItems = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene().getItems();
        backPackItems = TrailOfZombies.getCurrentGame().getBackPack().getItems();
        Item item;

        locationResources();
        //String savePrompt = this.displayMessage;
        //this.displayMessage = "Choose an Item to add to your backpack. (Enter -1 to cancel.)";
        boolean done = false;

        int choice = -1;
        //String input = getMenuInt();

        do {

            choice = View.getMenuInt("Choose an Item to add to your backpack. (Enter -1 to cancel.)");

            if (choice == -1) {
                done = true;
            }

            if (choice < 0 || choice >= sceneItems.size()) {
                ErrorView.display(this.getClass().getName(),
                        "Your choice is invalid.");
                return true;
            } else {
                item = sceneItems.get(choice);
            }
            //this.displayMessage = savePrompt;

            if (!done) {
                if (item != null);
            }
            if (GameControl.moveItem(sceneItems, backPackItems, item)) {
                this.console.println("You've taken the " + item.getDescription() + ".");
            }

            return false;
        } while (!done);
    }
}

/*   @Override 
    public boolean doAction(String value) {
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
            ErrorView.display(this.getClass().getName(),"
                        Invalid column number: "
                   + "The column must be 0-4.");
            value = getInput();
            columnNumber = Integer.parseInt(value);
        }
        Game game = TrailOfZombies.getCurrentGame();
        GameControl.movePlayer(game.getMap(),rowNumber,columnNumber);
        
        return true;
    }
 */
 /*  public void iterateResources(ArrayList<Item> inventoryItems){
       //use for-in to iterate over a list of items
       for (int i = 0; i < inventoryItems.size(); i++) {
           
           Item item = inventoryItems.get(i);
           this.console.println("\nItem: " + item.getDescription());
       }
    }*/
 /*public void gatherResources(){
        Game game = TrailOfZombies.getCurrentGame();
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        ArrayList<Item> items = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene().getItems();
        
        displayMessage = "\n Items at this Location:"
                        + items;
 */
