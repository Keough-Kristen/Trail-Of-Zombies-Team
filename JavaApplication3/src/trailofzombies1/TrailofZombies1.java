/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofzombies1;

import byui.cit260.trailOfZombies1.model.Player;

/**
 *
 * @author brycelaptop
 */
public class TrailofZombies1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setHighestScore(500);
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
