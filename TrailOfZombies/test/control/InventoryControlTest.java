/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristenkeough
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfCrate method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfCrate() {
        System.out.println("calcVolumeOfCrate");
             
        /********
         * Test Case 1
         ********/
        System.out.println("\tTest Case #1");
        double height = 24.0;
        double width = 36.0;
        double depth = 24.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 12.0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        
        /********
         * Test Case 2
         ********/
        System.out.println("\tTest Case #2");
        double height = -1.0;
        double width = 36.0;
        double depth = 24.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 3
         ********/
        System.out.println("\tTest Case #3");
        double height = 24.0;
        double width = -1.0;
        double depth = 24.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 4
         ********/
        System.out.println("\tTest Case #4");
        double height = 24.0;
        double width = 36.0;
        double depth = -1.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 5
         ********/
        System.out.println("\tTest Case #5");
        double height = 24.0;
        double width = 36.0;
        double depth = 49.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 6
         ********/
        System.out.println("\tTest Case #6");
        double height = 0;
        double width = 36.0;
        double depth = 24.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 7
         ********/
        System.out.println("\tTest Case #7");
        double height = 24.0;
        double width = 0;
        double depth = 24.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 8
         ********/
        System.out.println("\tTest Case #8");
        double height = 24.0;
        double width = 36.0;
        double depth = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 9
         ********/
        System.out.println("\tTest Case #9");
        double height = 24.0;
        double width = 36.0;
        double depth = 47.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 23.5;
        double result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
    
    

