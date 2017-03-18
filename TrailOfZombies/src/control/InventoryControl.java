/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exceptions.InventoryControlException;
import model.Item;

/**
 *
 * @author kristenkeough
 */
public class InventoryControl {
    public double calcVolumeOfCrate(double height, double width, double depth) 
    throws InventoryControlException {

        if (height<=0) { //height is negative?
		throw new InventoryControlException("The height must be greater than 0.");
    }
	if (width<=0) {//widht is negative?
		throw new InventoryControlException("The weight must be greater than 0.");
    }
	if (depth<=0 || depth>48) { //depth is out of range
		throw new InventoryControlException("The depth is out of range."
                         + "It must be greater than 0 and less than 49.");
    }
       
	double volume = (height * width * depth)/1728;

	return volume;
    }  
    
    //Kristen Keough Individual Assignment
    public double calcTireFootprint (double height, double width){
    
        if (width<0) { //width is negative?
                return -1;
    }
        if (height<0 || height>30) { //width is out of range
                return -2;
    }
        double radius = height / 2;
        double volume = (2 * Math.PI * radius);
        double footprint = (volume * width) / 144;
        
        return footprint;
    }
    
 /**
 *
 * author bryceandrews
 * 
 */
    
        public double calcWoodForCrates(double crates, double pallets)
        throws InventoryControlException {
    
            if (crates <= 0 || crates > (pallets / 2)){  //crates out of range
           
                throw new InventoryControlException("Crates cannot be 0 or negative"
                                            + "and cannot be great than half the "
                                            + "amount of pallets.");
            }
            
            if (pallets <= 0){  //pallets is negative
            
                throw new InventoryControlException("Pallets must be greater than 0.");
            }
            
            double woodPerPallet = 13;
            
            double woodPerCrate = 26;
            
            double palletsNeeded = (crates * woodPerCrate) - (pallets * woodPerPallet);
                    
            return palletsNeeded;
                    
        }

/**
 *

/**
*
* @author MarcoMorley
*/
//public class InventoryControl {
   public double calcGalNeeded(double miles, double mpg, double gallons){
   
   if (miles<0) {    //miles can't be less than zero
           return -1;
    }
   
   double tmiles = 1000;
   mpg = miles / gallons;
   miles = gallons * mpg;
   double NeededGal = (tmiles - miles) / mpg;
   
   return NeededGal;
   }
   
   
   
   /*public void stockpiledItems(ArrayList<Item> inventoryItems) {
    for (int i = 0; i < inventoryItems.size()); i++ {                                            
        Item item = inventoryItems.get(i);                                                    
        System.out.println("\n\tItem: " + item.getName()          
                         + "\n\tquantity: " + item.getQuantityInStock()); 
    }
}

*/
  
}




