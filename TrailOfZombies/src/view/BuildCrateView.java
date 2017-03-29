/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author kristenkeough
 */
public class BuildCrateView extends View {
    
     public BuildCrateView(){
            super("\n"
                    + "\n---------------------"
                    + "\n| Let's Build a Crate! |"
                    + "\n---------------------"
                    + "\nF - Food Crate"
                    + "\nW - Weapon Crate"
                    + "\nA - Water Crate"
                    + "\nM - Medicine Crate"
                    + "\nQ - Quit"
                    + "\n---------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
    
            switch (value){
                case "F":
                    this.displayFoodCrate();
                    break;
                case "W":
                    this.displayWeaponCrate();
                    break;
                case "A":
                    this.displayWaterCrate();
                    break;
                case "M":
                    this.displayMedicineCrate();
                    break;
                default:
                    this.console.println("\n***Invalid selection *** Try again.");
                    break;
            }
            
            return false;
    }

    private void displayFoodCrate() {
        
    }

    private void displayWeaponCrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayWaterCrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMedicineCrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
