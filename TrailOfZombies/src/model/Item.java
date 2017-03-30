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
        water("Water", 100, ItemType.water),
        bacon("Bacon", 50, ItemType.food),
        chicken("Chicken", 10, ItemType.food),
        fruits("Fruits", 25, ItemType.food),
        vegetables("Vegetables", 20, ItemType.water),
        meats("Meats", 50, ItemType.food),
        swords("Swords", 1, ItemType.weapon),
        pistol("Pistol",1, ItemType.weapon),
        staff("Staff", 1, ItemType.weapon),
        ar15("AR15", 1, ItemType.weapon),
        knife("Knife", 1, ItemType.weapon),
        crossbow("Crossbow", 1, ItemType.weapon),
        crate("Crate", 2, ItemType.crate),
        winch("Winch", 1, ItemType.weapon),
        fuel("Fuel", 5, ItemType.fuel),
        bumpers("Bumpers", 1, ItemType.carparts),
        snowplow("Snowplow", 1, ItemType.carparts),
        tires("Tires", 4, ItemType.carparts),
        medicine("Medicine", 5, ItemType.medicine);


private final String description;
private final int points;
private final ItemType type;

Item (String description,  int points, ItemType type) {
            this.description = description;
            this.points = points;
            this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public int getPoints() {
        return points;
    }
    
    public ItemType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", points=" + points + ", type=" + type + '}';
    }

  

}


