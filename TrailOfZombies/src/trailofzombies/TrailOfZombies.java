/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofzombies;

import model.BackPack;
import model.Items;
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

/**
 *
 * @author kristenkeough
 */
public class TrailOfZombies {
    public static void teamTest() {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setHighestScore(500);
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);   
    }
    
    
    
    public static void kristenTest(){
        Character characterOne = new Character();
        
        characterOne.setName("Zombie");
        characterOne.setDescription("Flesh eating person");
        
        Location locationOne = new Location();
        
        locationOne.setName("Library");
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited(1);
        locationOne.setRemaining(24);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Beginging of game and trying to get to first location");
        sceneOne.setTravelTime(30.0);
        sceneOne.setgridLocation("Start");
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
   
 
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
    
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
        gameOne.setPeople(0);
        
        BackPack backPackOne = new BackPack();
        
        backPackOne.setMaxWeight(30);
        backPackOne.setAmountLoaded(4);
        backPackOne.setLoadedWeight(15);
        backPackOne.setSlots(8);
        
        Items itemsOne = new Items();
        
        itemsOne.setInventoryType("Food");
        itemsOne.setQuantityInStock(2);
        itemsOne.setRequiredAmount(10);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(25);
        mapOne.setColumnCount(25);
        mapOne.setCurrentRow(5);
        mapOne.setCurrentColumn(10);
        mapOne.setCurrentScene("Library");
        
        ZombieCrusher zombieCrusherOne = new ZombieCrusher();
        
        zombieCrusherOne.setDescription("Van");
        zombieCrusherOne.setWheels("Spiked");
        zombieCrusherOne.setTires("All Terrain");
        zombieCrusherOne.setArmor("3/4 Steel Plate");
        zombieCrusherOne.setWeapons("50 Cal");
        zombieCrusherOne.setFuel("Full");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        String backPackInfo = backPackOne.toString();
        System.out.println(backPackInfo);
        
        String itemsInfo = itemsOne.toString();
        System.out.println(itemsInfo);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        String zombieCrusherInfo = zombieCrusherOne.toString();
        System.out.println(zombieCrusherInfo);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teamTest();
        kristenTest();
        bryceTest();
    }
    
}
