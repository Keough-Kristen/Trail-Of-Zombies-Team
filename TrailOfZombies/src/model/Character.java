/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kristenkeough
 */
public enum Character implements Serializable{
     
    John("He is willing to give food"),
    Eric("He will give you fuel for you vehicle"),
    Zeek("Is a gun runner that hates zombies"),
    Marilyn("She is a cunning thief when it comes to food"),
    Dan("Gotta watch him.  He is always wanting your fuel"),
    AnneOakley("All she wants is your weapon"),
    Mike("Knows his drugs from pharmacy school but without them he can't help you"),
    Vicki("She will NURSE you back to health"),
    DocHoliday("Claims he is a doctor but we will never know"),
    OldLadyZombie("Not fast but still deadly"),
    CopZombie("Can't use a gun but still bites"),
    BikerZombie("Forgot how to ride but will take 5 whenever he gets a chance"),
    MidgetZombie("Can't see him coming");
    
   
    private final String description;
    private final Point coordinates;

    
    Character (String description) {
    this.description = description;
    coordinates = new Point(1,1);
}
    

    

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
}

    }
