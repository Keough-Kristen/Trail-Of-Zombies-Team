/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofzombies;

import model.BackPack;
import model.InventoryItem;
import model.Game;
import model.Player;
import model.Character;
import model.Location;
import model.Scene;
import model.VehicleStorageScene;
import model.ResourceScene;
import model.HavenInterface;
import model.Map;
import model.ZombieCrusher;
import view.StartProgramView;
import view.MainMenuView;

/**
 *
 * @author kristenkeough
 */
public class TrailOfZombies {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        

     
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TrailOfZombies.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TrailOfZombies.player = player;
    }
    
    
    
    public static void kristenTest(){
        
        
        Location locationOne = new Location();
        
        locationOne.setName("Library");
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited(false);
        locationOne.setRemaining(24);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Beginging of game and trying to get to first location");
        sceneOne.setSymbol("Start Symbol");
        
        VehicleStorageScene vehicleStorageSceneOne = new VehicleStorageScene();
        
        vehicleStorageSceneOne.setVehicleCompletion("No");
        vehicleStorageSceneOne.setNumberOfMeals(5);
        vehicleStorageSceneOne.setNumberOfWeapons(2);
        
        ResourceScene resourceSceneOne = new ResourceScene();
        
        resourceSceneOne.setResourceType("Uncertain");
        resourceSceneOne.setAmountAvailable(3);
        resourceSceneOne.setZombies(5);
        
        HavenInterface havenInterfaceOne = new HavenInterface();
        
        havenInterfaceOne.setVehicleStatus("Complete");
        havenInterfaceOne.setFoodStatus("Complete");
        havenInterfaceOne.setWeaponStatus("Complete");
   
 
      
    
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        String vehicleStorageSceneInfo = vehicleStorageSceneOne.toString();
        System.out.println(vehicleStorageSceneInfo);
        
        String resourceSceneInfo = resourceSceneOne.toString();
        System.out.println(resourceSceneInfo);
        
        String havenInterfaceInfo = havenInterfaceOne.toString();
        System.out.println(havenInterfaceInfo);
        
    } 
    
    
    public static void bryceTest(){
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(53);
        gameOne.setNoPeople(0);
        
        BackPack backPackOne = new BackPack();
        
        backPackOne.setMaxWeight(30);
        backPackOne.setAmountLoaded(4);
        backPackOne.setLoadedWeight(15);
        backPackOne.setSlots(8);
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setInventoryType("Food");
        inventoryItemOne.setQuantityInStock(2);
        inventoryItemOne.setRequiredAmount(10);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(25);
        mapOne.setColumnCount(25);
        mapOne.setCurrentRow(5);
        mapOne.setCurrentColumn(10);
       // mapOne.setCurrentScene("Library");
        
        ZombieCrusher zombieCrusherOne = new ZombieCrusher();
        
        zombieCrusherOne.setDescription("Van");
        zombieCrusherOne.setWheels(4);
        zombieCrusherOne.setTires(4);
        zombieCrusherOne.setArmor(6);
        zombieCrusherOne.setWeapons(1);
        zombieCrusherOne.setFuel(70);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        String backPackInfo = backPackOne.toString();
        System.out.println(backPackInfo);
        
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemInfo);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        String zombieCrusherInfo = zombieCrusherOne.toString();
        System.out.println(zombieCrusherInfo);
        
    }
    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
       
      //  kristenTest();
      //  bryceTest();
   // }
    
}
