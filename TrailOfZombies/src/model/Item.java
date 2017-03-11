/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author brycelaptop
 */
public enum Item {
        water("Water", 100),
        bacon("Bacon", 50),
        chicken("Chicken", 10),
        fruits("Fruits", 25),
        vegetables("Vegetables", 20),
        meats("Meats", 50),
        swords("Swords", 1),
        pistol("Pistol",1),
        staff("Staff", 1),
        ar15("AR15", 1),
        knife("Knife", 1),
        crossbow("Crossbow", 1),
        pallet("Pallet", 4),
        winch("Winch", 1),
        fuel("Fuel", 5),
        bumpers("Bumpers", 1),
        snowplow("Snowplow", 1),
        tires("Tires", 4),
        medicine("Medicine", 5);


private final String description;
private final int points;

Item (String description,  int points) {
            this.description = description;
            this.points = points;
           
    }
}


