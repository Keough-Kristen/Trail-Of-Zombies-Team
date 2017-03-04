/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;

public class LocationMenuView extends View{

public LocationMenuView() {
        super("\n"
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
                    + "\nX - Return to Game Menu"
                    + "\n---------------------");
    }
    @Override
    public boolean doAction(String value) {
           
        value = value.toUpperCase();
    
            switch (value){
                case "A1":
                    this.airportMenuView();
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
                    this.AutoRepair();
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
                    return true;
                default:
                    System.out.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void airportMenuView() {
         AirportMenuView airportMenu = new AirportMenuView();
        airportMenu.display();
           }
   
    
    
    private void jerrysJunkyardAndSalvage() {
JunkyardMenuView junkyardMenu = new JunkyardMenuView();
        junkyardMenu.display();    }

    private void buildItHomeImprovement() {
HomeImprovementMenuView homeimprovementMenu = new HomeImprovementMenuView();
        homeimprovementMenu.display();    }

    private void tractorsBigAndSmall() {
TractorsBigAndSmallMenuView tractorsbigandsmallMenu = new TractorsBigAndSmallMenuView();
        tractorsbigandsmallMenu.display();    }

    private void joesTire() {
JoesTireMenuView joestireMenu = new JoesTireMenuView();
        joestireMenu.display();    }

    private void bobTheButcher() {
BobTheButcherMenuView bobthebutcherMenu = new BobTheButcherMenuView();
        bobthebutcherMenu.display();    }

    private void halsHardware() {
HalsHardwareMenuView halshardwareMenu = new HalsHardwareMenuView();
        halshardwareMenu.display();    }

    private void district5FireStation() {
FireStationMenuView firestationMenu = new FireStationMenuView();
        firestationMenu.display();    }

    private void bigMountainMotorSports() {
MotorSportsMenuView motorsportsMenu = new MotorSportsMenuView();
        motorsportsMenu.display();    }

    private void garysGunStore() {
  GarysGunStoreMenuView garysgunstoreMenu = new GarysGunStoreMenuView();
        garysgunstoreMenu.display();
           }

    private void arcoCityPoliceStation() {
ArcoCityPoliceMenuView arcocitypoliceMenu = new ArcoCityPoliceMenuView();
        arcocitypoliceMenu.display();
           }
    private void waterTower() {
WaterTowerMenuView watertowerMenu = new WaterTowerMenuView();
        watertowerMenu.display();
           }

    private void fidelityFiduciaryBank() {
BankMenuView bankMenu = new BankMenuView();
        bankMenu.display();
           }

    private void newHopeChurch() {
ChurchMenuView churchMenu = new ChurchMenuView();
        churchMenu.display();
           }
    private void virginiaMovieTheater() {
MovieTheaterMenuView movietheaterMenu = new MovieTheaterMenuView();
        movietheaterMenu.display();
           }

    private void donnasDiner() {
DonnasDinerMenuView donnasdinerMenu = new DonnasDinerMenuView();
        donnasdinerMenu.display();
           }

    private void downtownDrug() {
DowntownDrugMenuView downtownDrugMenu = new DowntownDrugMenuView();
        downtownDrugMenu.display();    }

    private void museumOfArco() {
MuseumOfArcoMenuView museumOfArcoMenu = new MuseumOfArcoMenuView();
        museumOfArcoMenu.display();    }

    private void bigJimsPigFarm() {
BigJimsPigFarmMenuView bigJimsPigFarmMenu = new BigJimsPigFarmMenuView();
        bigJimsPigFarmMenu.display(); }

    private void oxxoGas() {
OxxoGasMenuView oxxoGasMenu = new OxxoGasMenuView();
        oxxoGasMenu.display();   }

    private void shopNSave() {
ShopNSaveMenuView shopNSaveMenu = new ShopNSaveMenuView();
        shopNSaveMenu.display();   }

    private void petTown() {
PetTownMenuView petTownMenu = new PetTownMenuView();
        petTownMenu.display();    }

    private void communityLibrary() {
CommunityLibraryMenuView communityLibraryMenu = new CommunityLibraryMenuView();
        communityLibraryMenu.display();     }

    private void arcoHighSchool() {
ArcoHighSchoolMenuView arcoHighSchoolMenu = new ArcoHighSchoolMenuView();
        arcoHighSchoolMenu.display();   }

    private void AutoRepair() {
        AutoRepairMenuView autorepairMenu = new AutoRepairMenuView();
        autorepairMenu.display();
           }

       }

   
    
    

