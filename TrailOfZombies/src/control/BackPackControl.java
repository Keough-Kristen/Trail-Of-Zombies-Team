/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Item;

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

    public boolean moveItemFromSceneToBackPack(ArrayList<Item> sceneItems, ArrayList<Item> backPackItems, Item item) {
        if (sceneItems.contains(item)) {
            backPackItems.add(item);
            sceneItems.remove(item);

            return true;
        }
        return false;
    }
}
