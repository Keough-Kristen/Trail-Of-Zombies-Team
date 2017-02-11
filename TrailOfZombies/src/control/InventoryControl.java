/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author kristenkeough
 */
public class InventoryControl {
    public double calcVolumeOfCrate(double height, double width, double depth) {

        if (height<0) { //height is negative?
		return -1;
    }
	if (width<0) {//widht is negative?
		return -1;
    }
	if (depth<0 || depth>48) { //depth is out of range
		return -1;
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
                return -1;
    }
        double radius = height / 2;
        double volume = (2 * Math.PI * radius);
        double footprint = (volume * width) / 144;
        
        return footprint;
    }
}


