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
public class VehicleStorageScene implements Serializable {
    //class instance variables
    private String vehicleCompletion;
    private int numberOfMeals;
    private int numberOfWeapons;

    public VehicleStorageScene() {
    }
    
    

    public String getVehicleCompletion() {
        return vehicleCompletion;
    }

    public void setVehicleCompletion(String vehicleCompletion) {
        this.vehicleCompletion = vehicleCompletion;
    }

    public int getNumberOfMeals() {
        return numberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }

    public int getNumberOfWeapons() {
        return numberOfWeapons;
    }

    public void setNumberOfWeapons(int numberOfWeapons) {
        this.numberOfWeapons = numberOfWeapons;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.vehicleCompletion);
        hash = 97 * hash + this.numberOfMeals;
        hash = 97 * hash + this.numberOfWeapons;
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
        final VehicleStorageScene other = (VehicleStorageScene) obj;
        if (this.numberOfMeals != other.numberOfMeals) {
            return false;
        }
        if (this.numberOfWeapons != other.numberOfWeapons) {
            return false;
        }
        if (!Objects.equals(this.vehicleCompletion, other.vehicleCompletion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VehicleStorageScene{" + "vehicleCompletion=" + vehicleCompletion + ", numberOfMeals=" + numberOfMeals + ", numberOfWeapons=" + numberOfWeapons + '}';
    }
    
    
    
    
    
}
