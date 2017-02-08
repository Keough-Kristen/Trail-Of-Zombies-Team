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
}