/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kristenkeough
 */
public enum Character implements Serializable{
  
    John("He is willing to give food.", "water", 5, 0, 0, "", "", "John"),
    Eric("He will give you fuel for you vehicle.", "", 0, 0, 3, "", "", "Eric"),
    Zeek("Is a gun runner that hates zombies. He gives you a gun.", "", 0, 0, 0,
            "", "pistol", "Zeek"),
    Marilyn("She is a cunning thief when it comes to food.", "chicken",-5, 0, 0,
        "", "", "Marilyn"),
    Dan("Gotta watch him.  He is always wanting your fuel.", "", 0, 0, -5, "",
        "", "Dan"),
    AnneOakley("All she wants is your weapon.", "", 0, 0, 0, "", "ar15",
        "Anne Oakley"),
    Mike("Knows his drugs from pharmacy school but without them he can't help you.",
        "", 0, 1, 0, "medicine", "", "Mike"),
    Vicki("She will NURSE you back to health.", "", 0, 3, 0, "medicine", "", "Vicki"),
    DocHoliday("Claims he is a doctor but we will never know.", "", 0, 5, 0, "medicine",
            "", "Doc Holiday"),
    OldLadyZombie("Not fast but still deadly.", "", 0, -3, 0, "", "", "Old Lady Zombie"),
    CopZombie("Can't use a gun but still bites.", "", 0, -5, 0, "", "", "Cop Zombie"),
    BikerZombie("Forgot how to ride but will take 5 whenever he gets a chance.", 
        "", 0, -10, 0, "", "", "Biker Zombie"),
    MidgetZombie("Can't see him coming.", "", 0, -100, 0, "", "", "Midget Zombie");
   
   
    public final String description;
    private final String food;
    private final int foodpoints;
    private final int healthpoints;
    private final int fuelpoints;
    private final String medicine;
    private final String weapon;
    public final String name;

   
    
    Character (String description, String food, int foodpoints, int healthpoints,
            int fuelpoints, String medicine, String weapon, String name) {
            this.description = description;
            this.food = food;
            this.foodpoints = foodpoints;
            this.healthpoints = healthpoints;
            this.fuelpoints = fuelpoints;
            this.medicine = medicine;
            this.weapon = weapon;
            this.name = name;
        }

    public String getDescription() {
        return description;
    }

    public String getFood() {
        return food;
    }

    public int getFoodpoints() {
        return foodpoints;
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public int getFuelpoints() {
        return fuelpoints;
    }

    public String getMedicine() {
        return medicine;
    }
    

    public String getWeapon() {
        return weapon;
    }

   
    public String getName() {
        return name;
    }
    

    }
