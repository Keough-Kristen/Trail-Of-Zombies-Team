/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.BackPack;
import model.Game;
import model.Game.Item;
import model.InventoryItem;
import model.Map;
import model.Player;
import model.Scene;
import model.ZombieCrusher;
import trailofzombies.TrailOfZombies;
import view.GameMenuView;

/**
 *
 * @author kristenkeough
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
         Player player = new Player();
         player.setName(name);
         
         TrailOfZombies.setPlayer(player);

         return player;
}

    public static void createNewGame(Player player) {
       Game game = new Game();
        TrailOfZombies.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] itemsList = GameControl.createItemsList();
        game.setItems(itemsList);
        
        ZombieCrusher zombieCrusher = new ZombieCrusher();
        game.setZombieCrusher(zombieCrusher);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        BackPack backPack = new BackPack();
        game.setBackPack(backPack);
        
        MapControl.moveCharacterToStartingLocation(map);
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private static InventoryItem[] createItemsList() {
        InventoryItem[] inventory = 
            new InventoryItem[15];
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem chicken = new InventoryItem();
        chicken.setDescription("Chicken");
        chicken.setQuantityInStock(0);
        chicken.setRequiredAmount(0);
        inventory[Item.chicken.ordinal()] = chicken;
        
        InventoryItem fruits = new InventoryItem();
        fruits.setDescription("Fruits");
        fruits.setQuantityInStock(0);
        fruits.setRequiredAmount(0);
        inventory[Item.fruits.ordinal()] = fruits;
        
        InventoryItem vegetables = new InventoryItem();
        vegetables.setDescription("Vegetables");
        vegetables.setQuantityInStock(0);
        vegetables.setRequiredAmount(0);
        inventory[Item.vegetables.ordinal()] = vegetables;
        
        InventoryItem meats = new InventoryItem();
        meats.setDescription("Meats");
        meats.setQuantityInStock(0);
        meats.setRequiredAmount(0);
        inventory[Item.meats.ordinal()] = meats;
        
        InventoryItem swords = new InventoryItem();
        swords.setDescription("Swords");
        swords.setQuantityInStock(0);
        swords.setRequiredAmount(0);
        inventory[Item.swords.ordinal()] = swords;
        
        
        InventoryItem pistol = new InventoryItem();
        pistol.setDescription("Pistol");
        pistol.setQuantityInStock(0);
        pistol.setRequiredAmount(0);
        inventory[Item.pistol.ordinal()] = pistol;
        
        InventoryItem staff = new InventoryItem();
        staff.setDescription("Staff");
        staff.setQuantityInStock(0);
        staff.setRequiredAmount(0);
        inventory[Item.staff.ordinal()] = staff;
        
        InventoryItem ar15 = new InventoryItem();
        ar15.setDescription("AR15");
        ar15.setQuantityInStock(0);
        ar15.setRequiredAmount(0);
        inventory[Item.ar15.ordinal()] = ar15;
        
        InventoryItem knife = new InventoryItem();
        knife.setDescription("Knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventory[Item.knife.ordinal()] = knife;
        
        InventoryItem crossbow = new InventoryItem();
        crossbow.setDescription("Crossbow");
        crossbow.setQuantityInStock(0);
        crossbow.setRequiredAmount(0);
        inventory[Item.crossbow.ordinal()] = crossbow;
        
        InventoryItem pallet = new InventoryItem();
        pallet.setDescription("Pallet");
        pallet.setQuantityInStock(0);
        pallet.setRequiredAmount(0);
        inventory[Item.pallet.ordinal()] = pallet;
        
        InventoryItem winch = new InventoryItem();
        winch.setDescription("Winch");
        winch.setQuantityInStock(0);
        winch.setRequiredAmount(0);
        inventory[Item.winch.ordinal()] = winch;
        
        InventoryItem fuel = new InventoryItem();
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
        fuel.setRequiredAmount(0);
        inventory[Item.fuel.ordinal()] = fuel;
        
        InventoryItem tires = new InventoryItem();
        tires.setDescription("Tires");
        tires.setQuantityInStock(0);
        tires.setRequiredAmount(0);
        inventory[Item.tires.ordinal()] = tires;
        
        InventoryItem medicine = new InventoryItem();
        medicine.setDescription("Medecine");
        medicine.setQuantityInStock(0);
        medicine.setRequiredAmount(0);
        inventory[Item.medicine.ordinal()] = medicine;
        
        return inventory;
       
    
    }  
    public enum SceneType {
        start,
        instructions,
        finish;
    }
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("");
        
        return scenes;
    }
}

