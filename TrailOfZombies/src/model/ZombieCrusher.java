/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author brycelaptop
 */
public class ZombieCrusher implements Serializable {
    
    private ArrayList<Item> items;
    private boolean crate;
    public ZombieCrusher() {
         items = new ArrayList<Item>();
         this.crate = false;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public boolean hasCrate() {
        return crate;
    }

    public void setCrate(boolean crate) {
        this.crate = crate;
    }
   

}
   







/*
//class instance variables
    private String description;
    private double wheels;
    private double tires;
    private double armor;
    private double weapons;
    private double fuel;
    private boolean crate;

    public ZombieCrusher() {
        this.description = "\nThis is our melee vehicle. If you have faith"
                           + "\nyou will obliterate the path of the wicked.";
        this.wheels = 0;
        this.tires = 0;
        this.armor = 0;
        this.weapons = 0;
        this.fuel = 0;   
        this.crate = false;
    }

    public boolean isCrate() {
        return crate;
    }

    public void setCrate(boolean crate) {
        this.crate = crate;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWheels() {
        return wheels;
    }

    public void setWheels(double wheels) {
        this.wheels = wheels;
    }

    public Double getTires() {
        return tires;
    }

    public void setTires(double tires) {
        this.tires = tires;
    }

    public Double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public Double getWeapons() {
        return weapons;
    }

    public void setWeapons(double weapons) {
        this.weapons = weapons;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.wheels);
        hash = 53 * hash + Objects.hashCode(this.tires);
        hash = 53 * hash + Objects.hashCode(this.armor);
        hash = 53 * hash + Objects.hashCode(this.weapons);
        hash = 53 * hash + Objects.hashCode(this.fuel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ZombieCrusher other = (ZombieCrusher) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.wheels, other.wheels)) {
            return false;
        }
        if (!Objects.equals(this.tires, other.tires)) {
            return false;
        }
        if (!Objects.equals(this.armor, other.armor)) {
            return false;
        }
        if (!Objects.equals(this.weapons, other.weapons)) {
            return false;
        }
        return Objects.equals(this.fuel, other.fuel);
    }

    @Override
    public String toString() {
        return "ZombieCrusher{" + "description=" + description + ", wheels=" + wheels + ", tires=" + tires + ", armor=" + armor + ", weapons=" + weapons + ", fuel=" + fuel + '}';
    }
    
    
}
*/