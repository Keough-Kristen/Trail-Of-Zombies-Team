/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;


public class LocationMenuView {
      //private String menu;
    private String promptMessage;
  
    
    public LocationMenuView() {
        this.promptMessage = "\n"
                    + "\n---------------------"
                    + "\n| Location Menu         |"
                    + "\n|Select a location from the following.|"
                    + "\n---------------------"
                    + "\nA1 - Arco Regional Airport"
                    + "\nB1 - Jerry's Junkyard and Salvage"
                    + "\nC1 - Build It Home Improvement"
                    + "\nD1 - Tractors Big and Small"
                    + "\nE1 - Joe's Tire"
                    + "\nA2 - Bob the Butcher"
                    + "\nB2 - Hal's Hardware"
                    + "\nC2 - District 5 FireStation"
                    + "\nD2 - Big Mountain Motor Sports"
                    + "\nE2 - Gary's Gun Store"
                    + "\nA3 - Rick's Auto Repair"
                    + "\nB3 - Arco City Police Station"
                    + "\nC3 - Water Tower"
                    + "\nD3 - Fidelity Fiduciary Bank"
                    + "\nE3 - New Hope Church"
                    + "\nA4 - Virginia Movie Theater"
                    + "\nB4 - Donna's Diner"
                    + "\nC4 - Downtown Drug"
                    + "\nD4 - Museum of Arco"
                    + "\nE4 - Big Jim's Pig Farm"
                    + "\nA5 - OXXO Gas Station"
                    + "\nB5 - Shop n Save"
                    + "\nC5 - Pet Town"
                    + "\nD5 - Community Library"
                    + "\nE5 - Arco High School"
                    + "\nX - Exit"
                    + "\n---------------------";
    }
    
    public void displayMainMenuView() {
        
        boolean done = false;//Figure out why we have this here
        do{
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    
    }  

    private String getMenuOption() {
        
       Scanner keyboard = new Scanner(System.in);
       String value ="";
       boolean valid = false; //initialize to not valid
       
       while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
       }
      
    return value;
    
    }
    
    public boolean doAction(String choice) {
           
        choice = choice.toUpperCase();
    
            switch (choice){
                case "A1":
                    this.arcoRegionalAirport();
                    break;
                case "B1":
                    this.jerrysJunkyardAndSalvage();
                    break;
                case "C1":
                    this.buildItHomeImprovement();
                    break;
                case "D1":
                    this.tractorsBigAndSmall();
                    break;
                case "E1":
                    this.joesTire();
                    break;
                case "A2":
                    this.bobTheButcher();
                    break;
                case "B2":
                    this.halsHardware();
                    break;
                case "C2":
                    this.district5FireStation();
                    break;
                case "D2":
                    this.bigMountainMotorSports();
                    break;
                case "E2":
                    this.garysGunStore();
                    break;
                case "A3":
                    this.ricksAutoRepair();
                    break;
                case "B3":
                    this.arcoCityPoliceStation();
                    break;
                case "C3":
                    this.waterTower();
                    break;
                case "D3":
                    this.fidelityFiduciaryBank();
                    break;
                case "E3":
                    this.newHopeChurch();
                    break;
                case "A4":
                    this.virginiaMovieTheater();
                    break;
                case "B4":
                    this.donnasDiner();
                    break;
                case "C4":
                    this.downtownDrug();
                    break;
                case "D4":
                    this.museumOfArco();
                    break;
                case "E4":
                    this.bigJimsPigFarm();
                    break;
                case "A5":
                    this.oxxoGas();
                    break;
                case "B5":
                    this.shopNSave();
                    break;
                case "C5":
                    this.petTown();
                    break;
                case "D5":
                    this.communityLibrary();
                    break;
                case "E5":
                    this.arcoHighSchool();
                    break;
                case "X":
                    this.gameMenuView();
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void arcoRegionalAirport() {
System.out.println("*** arcoRegionalAirport function called ***");    }

    private void jerrysJunkyardAndSalvage() {
System.out.println("*** jerrysJunkyardAndSalvage function called ***");    }

    private void buildItHomeImprovement() {
System.out.println("*** buildItHomeImprovement function called ***");    }

    private void tractorsBigAndSmall() {
System.out.println("*** tractorsBigAndSmall function called ***");    }

    private void joesTire() {
System.out.println("*** joesTire function called ***");    }

    private void bobTheButcher() {
System.out.println("*** bobTheButcher function called ***");    }

    private void halsHardware() {
System.out.println("*** halsHardware function called ***");    }

    private void district5FireStation() {
System.out.println("*** district5FireStation function called ***");    }

    private void bigMountainMotorSports() {
System.out.println("*** bigMountainMotorSports function called ***");    }

    private void garysGunStore() {
System.out.println("*** garysGunStore function called ***");    }

    private void ricksAutoRepair() {
System.out.println("*** ricksAutoRepair function called ***");    }

    private void arcoCityPoliceStation() {
System.out.println("*** arcoCityPoliceStation function called ***");    }

    private void waterTower() {
System.out.println("*** waterTower function called ***");    }

    private void fidelityFiduciaryBank() {
System.out.println("*** fidelityFiduciaryBank function called ***");    }

    private void newHopeChurch() {
System.out.println("*** newHopeChurch function called ***");    }

    private void virginiaMovieTheater() {
System.out.println("*** virginiaMovieTheater function called ***");    }

    private void donnasDiner() {
System.out.println("*** donnasDiner function called ***");    }

    private void downtownDrug() {
System.out.println("*** downtownDrug function called ***");    }

    private void museumOfArco() {
System.out.println("*** museumOfArco function called ***");    }

    private void bigJimsPigFarm() {
System.out.println("*** bigJimsPigFarm function called ***");    }

    private void oxxoGas() {
System.out.println("*** oxxoGas function called ***");    }

    private void shopNSave() {
System.out.println("*** shopNSave function called ***");    }

    private void petTown() {
System.out.println("*** petTown function called ***");    }

    private void communityLibrary() {
System.out.println("*** communityLibrary function called ***");    }

    private void arcoHighSchool() {
System.out.println("*** arcoHighSchool function called ***");    }

    private void gameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();    }

    void displayLocationMenuView() {
        System.out.println("*** displayLocationMenuView function called ***");
    }

    

}