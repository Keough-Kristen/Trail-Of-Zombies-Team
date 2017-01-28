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
public class HavenInterface implements Serializable {
    public String vehicleStatus;
    public String foodStatus;
    public String weaponStatus;

    public HavenInterface() {
    }
    
    

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(String foodStatus) {
        this.foodStatus = foodStatus;
    }

    public String getWeaponStatus() {
        return weaponStatus;
    }

    public void setWeaponStatus(String weaponStatus) {
        this.weaponStatus = weaponStatus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.vehicleStatus);
        hash = 41 * hash + Objects.hashCode(this.foodStatus);
        hash = 41 * hash + Objects.hashCode(this.weaponStatus);
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
        final HavenInterface other = (HavenInterface) obj;
        if (!Objects.equals(this.vehicleStatus, other.vehicleStatus)) {
            return false;
        }
        if (!Objects.equals(this.foodStatus, other.foodStatus)) {
            return false;
        }
        if (!Objects.equals(this.weaponStatus, other.weaponStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HavenInterface{" + "vehicleStatus=" + vehicleStatus + ", foodStatus=" + foodStatus + ", weaponStatus=" + weaponStatus + '}';
    }
    
    
}
