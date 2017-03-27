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
 * @author kristenkeough
 */
public class Scene implements Serializable{
    //class instance variables
    private String description;
    private String name;
    private String symbol;
    private ArrayList<Item> items;
    private Character character;

    public Scene() {
        items = new ArrayList<>();
        
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    
    

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", name=" + name + ", symbol=" + symbol + ", items=" + items + ", character=" + character + '}';
    }
}
