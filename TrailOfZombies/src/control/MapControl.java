/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Map;
import model.Player;
import model.Point;
import model.Scene;
import model.SceneType;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class MapControl {

    public static Map createMap() {
        
        Map map = new Map (5, 5);
        
        Scene[] scenes = GameControl.createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        GameControl.movePlayerToStartingLocation(map);
        
        return map;
    }
    
}
