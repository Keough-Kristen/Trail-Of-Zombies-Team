/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofzombies;

import model.Player;

/**
 *
 * @author kristenkeough
 */
public class TrailOfZombies {
    public static void teamTest() {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setHighestScore(500);
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);   
    }
    
    
    
    public static void kristenTest(){
        
    }
    
    
    
    public static void bryceTest(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teamTest();
        kristenTest();
        bryceTest();
    }
    
}