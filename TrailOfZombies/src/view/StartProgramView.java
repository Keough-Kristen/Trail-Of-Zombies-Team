/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Player;


/**
 *
 * @author kristenkeough
 */
public class StartProgramView extends View {
    
   public StartProgramView() {
        super("\nPlease enter your name: ");
        //display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
       System.out.println(
               "\n***************************************"
               +"\n* The government was working on a super-soldier serum in a facility *"
               +"\n* west of the city of Arco when one of the scientists working*"
               +"\n* on the project accidentally contaminated herself. She was *"
               +"\n* working on vaporizing the serum to facilitate the application*"
               +"\n* on a large scale. When her hazmat suit failed and she inhaled*"
               +"\n* the serum vapor it reacted quicker than anyone could imagine.*"
               +"\n* The reaction shut down her system immediately and revived her*"
               +"\n* instantly, but do to her overcharged metabolism she had an*"
               +"\n* insatiable desire to eat.*"
               +"\n*"
               +"\n*  The town was immediately notified to leave the area and seek*"
               +"\n* shelter elsewhere. The community thought it was some kind of*"
               +"\n* radiation leak. People started making preparations to leave *"
               +"\n* when the first man-eaters made their way to town. At first *"
               +"\n* the citizens tried to help those they thought were injured *"
               +"\n* from radiation exposure. They soon realized the crazed workers*"
               +"\n* were far gone and only wanted one thing—to eat flesh.*"
               +"\n**"
               +"\n* As a citizen of the city of Arco, you are responsible for *"
               +"\n* your own safety. You and your group need to gather supplies *"
               +"\n* from buildings in the surrounding area. Bring them back to *"
               +"\n* your home base and stockpile them until you have enough to *"
               +"\n* leave the city and safely make your way to the nearest haven.*"
               +"\n* Beware of the flesh-eating super zombies that roam the area *"
               +"\n* looking for food. You must build a vehicle to transport your*"
               +"\n* party to the haven in the mountains to the north.*"
               +"\n**"
               +"\n* The game is over once you have gathered enough supplies and*"
               +"\n* built your zombie killing transportation to make your way to*"
               +"\n* the haven. The game begins when the flesh-eaters enter the *"
               +"\n* city and start eating people.*");
    }

@Override 
    public boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
       System.out.println("\nInvalid players name: "
                   + "The name must be greater than one character in length.");
       return false;
    }
        Player player = GameControl.createPlayer(playersName);
        
if (player == null) {
    System.out.println("\nError creating the player.");
    return false;
}
    
this.displayNextView(player);
        return true; 

    }

    private void displayNextView(Player player) {
        System.out.println("\n======================================"
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you don't get eaten!"
                         + "\n======================================"
                         );
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.display();
}
}