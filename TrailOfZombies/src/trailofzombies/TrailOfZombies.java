/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofzombies;

import model.Player;
import model.Character;
import model.Location;
import model.Scene;
import model.VehicleStorageScene;
import model.ResourceScene;
import model.HavenInterface;

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
