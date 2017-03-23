/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.PrintWriter;
import trailofzombies.TrailOfZombies;

/**
 *
 * @author kristenkeough
 */
public class ErrorView {
   
    private static final PrintWriter errorFile = TrailOfZombies.getOutFile();
    private static final PrintWriter logFile = TrailOfZombies.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------"
                    + "\n- ERROR - " + errorMessage
                    + "\n-----------------------------");
    }
}
