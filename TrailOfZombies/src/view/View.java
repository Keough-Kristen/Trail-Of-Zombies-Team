/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author kristenkeough
 */
public abstract class View implements ViewInterface {
   protected String displayMessage;
   
   public View(){    
   }
   public View(String message) {
       this.displayMessage = message;
   }
   @Override
   public void display() {
       boolean done = false;
      do {
          //prompt for and get players name
          String value = this.getInput();
          if (value.toUpperCase().equals("Q")) //user wants to quit
              return; //exit the view
          
          //do the requested action and display the next view
          done = this.doAction(value);
          
      } while (!done); //exit the view when done == true
   }
    @Override
    public String getInput() {
       
       Scanner keyboard = new Scanner(System.in);
       boolean valid = false;
       String value = null;
       
       //while a valid name has not been retrieved
       while (!valid) {
           
           //prompt for the player's name
           System.out.println ("\n" + this.displayMessage);
           
           //get the valye entered from the keyboard
           value = keyboard.nextLine();
           value = value.trim();
           
           if (value.length ()<1) { //blank value entered
               System.out.println ("\n*** Yout must enter a value. *** ");
               continue;
           }
           break;
       }
       return value; //return the name
   }
   }

   

