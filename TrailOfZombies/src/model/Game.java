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
public class Game implements Serializable {
    
    //class instance variables
    private double totalTime;
    private int noPeople;
    
    private ZombieCrusher zombiecrusher;
    private BackPack backpack;
    private WarehouseItem warehouseItem;
    private Player player;
    private Map map;
    
    
    
    private InventoryItem[] inventory;
    private Character[] character;
    private Item item;
     
    public Game() {
    }

    public InventoryItem[] getInventory() {
         InventoryItem[] inventory = new InventoryItem[Item.values().length];
        
        return inventory;
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

    public ZombieCrusher getZombiecrusher() {
        return zombiecrusher;
    }

    public void setZombiecrusher(ZombieCrusher zombiecrusher) {
        this.zombiecrusher = zombiecrusher;
    }

    public BackPack getBackPack() {
        return backpack;
    }

    public void setBackPack(BackPack backpack) {
        this.backpack = backpack;
    }

    public WarehouseItem getWarehouseItem() {
        return warehouseItem;
    }

    public void setWarehouseItem(WarehouseItem warehouseitem) {
        this.warehouseItem = warehouseitem;
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
    //TODO- create Zombie crusher function
    public void setZombieCrusher(ZombieCrusher zombieCrusher) {
      this.zombiecrusher = zombieCrusher;
    }
         
    
}
