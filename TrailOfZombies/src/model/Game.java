/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfZombies1.model;

import java.io.Serializable;
/**
 *
 * @author brycelaptop
 */
public class Game implements Serializable {
    
    //class instance variables
    private double totalTime;
    private double nopeople;

    public Game() {
    }
    
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNopeople() {
        return nopeople;
    }

    public void setNopeople(double nopeople) {
        this.nopeople = nopeople;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.nopeople) ^ (Double.doubleToLongBits(this.nopeople) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return Double.doubleToLongBits(this.nopeople) == Double.doubleToLongBits(other.nopeople);
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", nopeople=" + nopeople + '}';
    }
    
    
    
}
