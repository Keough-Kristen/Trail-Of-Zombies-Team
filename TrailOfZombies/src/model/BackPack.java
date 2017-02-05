/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author brycelaptop
 */
public class BackPack implements Serializable {
    
    //class instance variables
    private double maxWeight;
    private double amountLoaded;
    private double loadedWeight;
    private double slots;

    public BackPack() {
    }
    
    

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(double amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    public double getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(double loadedWeight) {
        this.loadedWeight = loadedWeight;
    }

    public double getSlots() {
        return slots;
    }

    public void setSlots(double slots) {
        this.slots = slots;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.amountLoaded) ^ (Double.doubleToLongBits(this.amountLoaded) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.loadedWeight) ^ (Double.doubleToLongBits(this.loadedWeight) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.slots) ^ (Double.doubleToLongBits(this.slots) >>> 32));
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
        final BackPack other = (BackPack) obj;
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountLoaded) != Double.doubleToLongBits(other.amountLoaded)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loadedWeight) != Double.doubleToLongBits(other.loadedWeight)) {
            return false;
        }
        return Double.doubleToLongBits(this.slots) == Double.doubleToLongBits(other.slots);
    }

    @Override
    public String toString() {
        return "BackPack{" + "maxWeight=" + maxWeight + ", amountLoaded=" + amountLoaded + ", loadedWeight=" + loadedWeight + ", slots=" + slots + '}';
    }
    
    
    
}
