/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exceptions.GameControlException;
import java.util.ArrayList;
import model.Item;
import control.GameControl;
        
/**
 *
 * @author kristenkeough
 */
public class BackPackControl {

    public void removeArrayListItems(ArrayList<Item> inventory, Item item) {
//inventory.remove(); // remove a specific index
        int pistolIndex = 6;
        inventory.remove(pistolIndex);
        inventory.remove(item);
        inventory.clear(); //remove all items from the ArrayList
    }

    public boolean moveItemFromSceneToBackPack(ArrayList<Item> sceneItem, ArrayList<Item> backPackItem, Item item) throws GameControlException {
       return GameControl.moveItem(sceneItem, backPackItem, item);
    }
    public boolean moveItemFromBackPackToWarehouse(ArrayList<Item> backPackItem, ArrayList<Item> warehouseItem, Item item) throws GameControlException {
       return GameControl.moveItem(backPackItem, warehouseItem, item);
    }
}

