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
 * @author brycelaptop
 */
public class ZombieCrusher implements Serializable {
    
    //class instance variables
    private String description;
    private String wheels;
    private String tires;
    private String armor;
    private String weapons;
    private String fuel;

    public ZombieCrusher() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
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
