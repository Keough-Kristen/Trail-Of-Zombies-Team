/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kristenkeough
 */
public enum SceneInfo {
    
        ArcoRegionalAirport("No flights coming or going!", "Arco Regional Airport"),
        JerrysJunkyardAndSalvage("We have parts for your Zombie crusher", "Jerry's Junkyard And Salvage"),
        BuildItHomeImprovement("Zombie home defense DIY", "Build It Home Improvement"),
        TractorsBigAndSmall("Tractors to move your zombies.", "Tractors Big And Small"),
        JoesTire("Beware of dog!", "Joe's Tire"),
        BobTheButcher("Zombie arms and legs!", "Bob The Butcher"),
        WaterTower("Drown your zombie here!","Water Tower"),
        DistrictFireStation("No one on duty!","District 5 Fire Station"),
        BigMountainMotorSports("We have cleats to run from your zombie!", "Big Mountain Motor Sports"),
        GarysGunStore("Sold out", "Gary's Gun Store"),
        RicksAutoRepair("Fix up your Zombie crusher here!", "Rick's Auto Repair"),
        ArcoCityPoliceStation("911 not working!", "Arco City Police Station"),
        Warehouse("Main base to store resources", "Warehouse"),
        FidelityFiduciaryBank("Closed", "Fidelity Fiduciary Bank"),
        NewHopeChurch("The apacolypse is here!", "New Hope Church"),
        VirginiaMovieTheater("Now Showing: Night of the Living Dead", "Virginia Movie Theater"),
        DonnasDiner("Fresh meat!", "Donna's Diner"),
        DowntownDrug("Beat your Zombie depression, get your Zoloft here!", "Downtown Drug"),
        MuseumOfArco("Zombie art on display", "Museum Of Arco");


private final String description;
private final String name;

SceneInfo (String description,  String name) {
            this.description = description;
            this.name = name;
           
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SceneInfo{" + "description=" + description + ", name=" + name + '}';
    }

}

