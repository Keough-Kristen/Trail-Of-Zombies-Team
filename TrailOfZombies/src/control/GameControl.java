/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.BackPack;
import model.Game;
import model.Item;
import model.InventoryItem;
import model.Location;
import model.Map;
import model.Player;
import model.Scene;
import model.SceneType;
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

        InventoryItem[] itemsList = GameControl.createInventoryList();
        game.setItems(itemsList);

        /* ZombieCrusher zombieCrusher = new ZombieCrusher();
        game.setZombieCrusher(zombieCrusher);
         */
        Map map = MapControl.createMap();
        game.setMap(map);

        /*
        BackPack backPack = new BackPack();
        game.setBackPack(backPack);
         */
    }

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);

    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.ArcoRegionalAirport.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.JerrysJunkyardandSalvage.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.BuildItHomeImprovement.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.TractorsBigandSmall.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.JoesTire.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.BobtheButcher.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.HalsHardware.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.District5FireStation.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.BigMountainMotorSports.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.GarysGunStore.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.RicksAutoRepair.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.ArcoCityPoliceStation.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.WaterTower.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.FidelityFiduciaryBank.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.NewHopeChurch.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.VirginiaMovieTheater.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.DonnasDiner.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.DowntownDrug.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.MuseumofArco.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.BigJimsPigFarm.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.OXXOGasStation.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.ShopnSave.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.PetTown.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.CommunityLibrary.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.ArcoHighSchool.ordinal()]);

    }

    private static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory
                = new InventoryItem[Item.values().length];

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        InventoryItem bacon = new InventoryItem();
        bacon.setDescription("Bacon");
        bacon.setQuantityInStock(0);
        bacon.setRequiredAmount(0);
        inventory[Item.bacon.ordinal()] = bacon;

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

        InventoryItem bumpers = new InventoryItem();
        bumpers.setDescription("Bumpers");
        bumpers.setQuantityInStock(0);
        bumpers.setRequiredAmount(0);
        inventory[Item.bumpers.ordinal()] = bumpers;

        InventoryItem snowplow = new InventoryItem();
        snowplow.setDescription("Snow Plow");
        snowplow.setQuantityInStock(0);
        snowplow.setRequiredAmount(0);
        inventory[Item.snowplow.ordinal()] = snowplow;

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

    public static Scene[] createScenes() {

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene scene = new Scene();
        scene.setDescription("Arco Regional Airport");
        scene.setSymbol("RA");
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.vegetables);
        //scene.getItems().remove(Item.vegetables);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.ArcoRegionalAirport.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Jerry's Junkyard and Salvage");
        scene.setSymbol("JJ");
        scene.getItems().add(Item.bumpers);
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.tires);
        scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.JerrysJunkyardandSalvage.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Build It Home Improvement");
        scene.setSymbol("HI");
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.water);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.BuildItHomeImprovement.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Tractors Big and Small");
        scene.setSymbol("TS");
        scene.getItems().add(Item.winch);
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.fuel);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.TractorsBigandSmall.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Joe's Tire");
        scene.setSymbol("JT");
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.tires);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.JoesTire.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Bob the Butcher");
        scene.setSymbol("BB");
        scene.getItems().add(Item.bacon);
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.water);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.BobtheButcher.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Hal's Hardware");
        scene.setSymbol("HH");
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.pistol);
        scene.getItems().add(Item.water);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.HalsHardware.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("District 5 FireStation");
        scene.setSymbol("FS");
        scene.getItems().add(Item.vegetables);
        scene.getItems().add(Item.fruits);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.pallet);
        scene.setCharacter(model.Character.John);
        scenes[SceneType.District5FireStation.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Big Mountain Motor Sports");
        scene.setSymbol("MS");
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.tires);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.BigMountainMotorSports.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Gary's Gun Store");
        scene.setSymbol("GG");
        scene.getItems().add(Item.ar15);
        scene.getItems().add(Item.pistol);
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.pallet);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.GarysGunStore.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Rick's Auto Repair");
        scene.setSymbol("RA");
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.pallet);
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.tires);
        scene.setCharacter(model.Character.Eric);
        scenes[SceneType.RicksAutoRepair.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Arco City Police Station");
        scene.setSymbol("PS");
        scene.getItems().add(Item.pistol);
        scene.getItems().add(Item.ar15);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.swords);
        scene.setCharacter(model.Character.CopZombie);
        scenes[SceneType.ArcoCityPoliceStation.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Water Tower");
        scene.setSymbol("WT");
        scene.getItems().add(Item.water);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.WaterTower.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Fidelity Fiduciary Bank");
        scene.setSymbol("FD");
        scene.getItems().add(Item.water);
        scene.setCharacter(model.Character.Zeek);
        scenes[SceneType.FidelityFiduciaryBank.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("New Hope Church");
        scene.setSymbol("NH");
        scene.getItems().add(Item.pistol);
        scene.getItems().add(Item.vegetables);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.fruits);
        scene.setCharacter(model.Character.Marilyn);
        scenes[SceneType.NewHopeChurch.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Virginia Movie Theater");
        scene.setSymbol("MT");
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.swords);
        scene.setCharacter(model.Character.Dan);
        scenes[SceneType.VirginiaMovieTheater.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Donna's Diner");
        scene.setSymbol("DD");
        scene.getItems().add(Item.chicken);
        scene.getItems().add(Item.meats);
        scene.getItems().add(Item.bacon);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.vegetables);
        scene.getItems().add(Item.fruits);
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.ar15);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.DonnasDiner.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Downtown Drug");
        scene.setSymbol("DT");
        scene.getItems().add(Item.medicine);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.staff);
        scene.setCharacter(model.Character.Mike);
        scenes[SceneType.DowntownDrug.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Museum of Arco");
        scene.setSymbol("MA");
        scene.getItems().add(Item.crossbow);
        scene.getItems().add(Item.staff);
        scene.getItems().add(Item.water);
        scene.setCharacter(model.Character.AnneOakley);
        scenes[SceneType.MuseumofArco.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Big Jim's Pig Farm");
        scene.setSymbol("PF");
        scene.getItems().add(Item.bacon);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.vegetables);
        //scene.setCharacter(model.Character.Mike);
        scenes[SceneType.BigJimsPigFarm.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("OXXO Gas Station");
        scene.setSymbol("GS");
        scene.getItems().add(Item.fuel);
        scene.getItems().add(Item.pistol);
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.medicine);
        scene.setCharacter(model.Character.BikerZombie);
        scenes[SceneType.OXXOGasStation.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Shop n Save");
        scene.setSymbol("SS");
        scene.getItems().add(Item.water);
        scene.getItems().add(Item.meats);
        scene.getItems().add(Item.chicken);
        scene.getItems().add(Item.bacon);
        scene.getItems().add(Item.vegetables);
        scene.getItems().add(Item.fruits);
        scene.getItems().add(Item.knife);
        scene.getItems().add(Item.staff);
        scene.getItems().add(Item.medicine);
        scene.getItems().add(Item.pallet);
        //scene.setCharacter(model.Character.MidgetZombie);
        scenes[SceneType.ShopnSave.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Pet Town");
        scene.setSymbol("PT");
        scene.getItems().add(Item.medicine);
        scene.getItems().add(Item.pallet);
        scene.setCharacter(model.Character.Vicki);
        scenes[SceneType.PetTown.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Community Library");
        scene.setSymbol("CL");
        scene.getItems().add(Item.pallet);
        scene.setCharacter(model.Character.DocHoliday);
        scenes[SceneType.CommunityLibrary.ordinal()] = scene;

        scene = new Scene();
        scene.setDescription("Arco High School");
        scene.setSymbol("HS");
        scene.getItems().add(Item.staff);
        scene.getItems().add(Item.vegetables);
        scene.getItems().add(Item.fruits);
        scene.getItems().add(Item.meats);

        scene.setCharacter(model.Character.OldLadyZombie);
        scenes[SceneType.ArcoHighSchool.ordinal()] = scene;

        return scenes;
    }

    public static boolean moveItem(ArrayList<Item> sourceItems, ArrayList<Item> destinationItems, Item item) {
        if (sourceItems.contains(item)) {
            destinationItems.add(item);
            sourceItems.remove(item);

            return true;
        }
        return false;
    }

    public static void sortItemsByName(ArrayList<Item> items) {

        int i, j;
        Item temp;

        for (i = 0; i < items.size() - 1; i++) {
            for (j = i + 1; j < items.size(); j++) {
                if (items.get(i).name().compareToIgnoreCase(items.get(j).name()) > 0) {
                    temp = items.get(i);
                    items.set(i, items.get(j));
                    items.set(j, temp);

                }
            }
        }
    }
}
