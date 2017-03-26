/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package view;

import control.GameControl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Game;
import model.InventoryItem;
import model.Item;
import model.Location;
import model.Map;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
         super("\n"
                    + "\n---------------------"
                    + "\n| Game Menu         |"
                    + "\n---------------------"
                    + "\nM - Display Map"
                    + "\nT - Travel to new location"
                    + "\nR - Etimating the amount of resources?"
                    + "\nK - Welcome to the Haven"
                    + "\nH - Help Menu"
                    + "\nV - Get Crate Volume"
                    + "\nG - How many gallons do you need?"
                    + "\nF - Get Tire Footprint"
                    + "\nW - Calculate Wood for Crates"
                    + "\nC - Get character list"
                    + "\nQ - Quit"
                    + "\n---------------------");
    }
 
    @Override
    public boolean doAction(String value) {
           
        value = value.toUpperCase();
    
            switch (value){
                
                case "I":
                    this.viewInventory();
                    break;
                case "M":
                    this.displayMap();
                    break;
                case "T":
                    this.displayTravelToNewLocation();
                    break;
                case "R":
                    this.displayResources();
                    break;
                case "K":
                    this.displayGoToHaven();
                    break;
                case "H":
                    this.displayHelp();
                    break;
                case "V":
                    this.displayVolume();
                    break;    
                case "G":
                    this.displayGallons();
                    break;  
                case "F":
                    this.displayFootprint();
                    break;
                case "W":
                    this.displayWood();
                    break;
                case "C":
                    this.displayCharacter();
                    break;
                default:
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }


    private void displayResources() {
        this.console.println("*** displayResources function called ***");
    }

    private void displayGoToHaven() {
        this.console.println("*** displayGoToHaven function called ***");
    }

    private void displayHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();    }

    void displayMenu() {
        this.console.println("*** display function called ***");
    }

    private void displayVolume() {
        CrateVolumeView crateVolume = new CrateVolumeView();
        crateVolume.displayView();
        }


    private void displayGallons() {
     GalNeededView  galNeeded = new GalNeededView();
        galNeeded.displayGalView();
        }


    private void displayFootprint() {
        TireFootprintView tireFootprint = new TireFootprintView();
        tireFootprint.displayView();
    }
    
     private void displayWood() {
        WoodForCratesView woodForCrates = new WoodForCratesView();
        woodForCrates.displayWoodView();
    }
    
    private void viewInventory() {
         StringBuilder line;
         
         Game game = TrailOfZombies.getCurrentGame();
         InventoryItem[] inventory = game.getInventory();
         
         this.console.println("\n     LIST OF INVENTORY ITEMS");
         line = new StringBuilder("                        ");
         line.insert(0, "DESCRIPTION");
         line.insert(20, "REQUIRED");
         line.insert(30, "IN STOCK");
         this.console.println(line.toString());
         
         //for each inventory item
         for (InventoryItem item : inventory) {
             line = new StringBuilder ("                     ");
             line.insert(0, item.getDescription());
             line.insert(23, item.getRequiredAmount());
             line.insert(23, item.getQuantityInStock());
             
             //Display the line
             this.console.println(line.toString());
         }
         
    }

     public void displayMap() {
  String leftIndicator;
  String rightIndicator;

  Game game = TrailOfZombies.getCurrentGame(); // retreive the game
  Map map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    this.console.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      this.console.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    this.console.println();
    for( int row = 0; row < locations.length; row++){
     this.console.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].getVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       this.console.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             this.console.print(leftIndicator + "??" + rightIndicator);
        }
        else
          this.console.print(leftIndicator
             + locations[row][column].getScene().getSymbol()
             + rightIndicator);
      }
     this.console.println("|");
    }
    this.console.println(map.getCurrentLocation().getScene().getName());
    this.console.println(map.getCurrentLocation().getScene().getDescription());
    printListOfItems();
    
     } 
   public void printListOfItems() {
        
        ArrayList<Item> sceneItems = TrailOfZombies.getCurrentGame().getMap().getCurrentLocation().getScene().getItems(); 
         
        GameControl.sortItemsByName(sceneItems);
        
            for (Item item:sceneItems) {
               this.console.println("Resource Item at scene:" + item.name()); 
            }
                         
       
}
    private void displayTravelToNewLocation() {
         TravelToNewLocationView newLocation = new TravelToNewLocationView();
         newLocation.display();
         this.displayMap();
         SceneView sceneView = new SceneView();       
         sceneView.display();
         
    }

    private void displayCharacter() {
        String savePrompt = this.displayMessage;
        displayMessage = "\n\nEnter the file name (.txt) for the report. ";
        String filePath = this.getInput();

        try(PrintWriter out = new PrintWriter(filePath)){
            out.println("\n\n                           Character Report              ");
            out.printf("%n%-20s%20s", "Name", "Description");
            out.printf("%n%-20s%20s", "----", "-----------");
            
            for (model.Character character : model.Character.values()){
                out.printf("%n%-20s%20s" , character.getName()
                                          , character.getDescription());
            }
                    
        } catch (IOException ex){
            ErrorView.display("View Class",
                        "Program Unrunnable");
        }
        this.console.println("Success! Your file has been saved to your hard drive.");
        this.displayMessage = savePrompt;

    }
  
}
