/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author brycelaptop
 */
public class Game implements Serializable {
    
    //class instance variables
    private double totalTime;
    private int noPeople;
    
    private ZombieCrusher zombiecrusher;
    private BackPack backpack;
    private Warehouse  warehouse;
    private Crate crate;
    private Player player;
    private Map map;
    private boolean gameOver = false;
    
    
    private InventoryItem[] inventory;
    private Character[] character;
    private Item item;
     
    public Game() {
    }

    public InventoryItem[] getInventory() {
         InventoryItem[] inventory = new InventoryItem[Item.values().length];
        
        return inventory;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public ZombieCrusher getZombieCrusher() {
        return zombiecrusher;
    }

    public void setZombieCrusher(ZombieCrusher zombiecrusher) {
        this.zombiecrusher = zombiecrusher;
    }

    public BackPack getBackPack() {
        return backpack;
    }

    public void setBackPack(BackPack backpack) {
        this.backpack = backpack;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
        

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    

    public InventoryItem[] getItems() {
        return inventory;
    }

    public void setItems(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BackPack getBackpack() {
        return backpack;
    }

    public void setBackpack(BackPack backpack) {
        this.backpack = backpack;
    }

    public Crate getCrate() {
        return crate;
    }

    public void setCrate(Crate crate) {
        this.crate = crate;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
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
        return this.noPeople == other.noPeople;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

      
    
}
