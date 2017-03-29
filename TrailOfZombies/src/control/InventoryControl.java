                      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.InventoryControlException;
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
    public double calcTireFootprint (double height, double width)
            throws InventoryControlException {
        
    
        if (width<=0) { //width is negative?
                throw new InventoryControlException("Width of the tire cannot be negative.");
            }
        if (height<=0 || height>30) { //height is out of range
                throw new InventoryControlException("Height of the tire cannot be negative.");
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
    
            if (crates <= 0){  //crates out of range
           
                throw new InventoryControlException("Crates must be greater than 0.");
            }
            
            if (pallets <= 0){  //pallets is negative
            
                throw new InventoryControlException("Pallets must be greater than 0.");
            }
            
            double woodPerPallet = 13;
            
            double woodPerCrate = 26;
            
            double palletsNeeded = ((crates * woodPerCrate) - (pallets * woodPerPallet))/13;
                    
            return palletsNeeded;
                    
        }

/**
 *

/**
*
* @author MarcoMorley
*/
//public class InventoryControl {
   public double calcGalNeeded(double tmiles, double gallons)
   throws InventoryControlException{
   
   if (tmiles <= 0) {    //miles can't be less than zero
        throw new InventoryControlException("Miles must be greater than 0.");    }
   
   double miles = 0;
   double mpg = 15;
   miles = gallons * mpg;
   double NeededGal = (tmiles - miles) / mpg;
   
   return NeededGal;
   }
  
}




