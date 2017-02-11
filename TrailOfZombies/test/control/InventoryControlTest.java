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
        height = -1.0;
        width = 36.0;
        depth = 24.0;
        instance = new InventoryControl();
        expResult = -1.0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 3
         ********/
        System.out.println("\tTest Case #3");
        height = 24.0;
        width = -1.0;
        depth = 24.0;
        instance = new InventoryControl();
        expResult = -1.0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 4
         ********/
        System.out.println("\tTest Case #4");
        height = 24.0;
        width = 36.0;
        depth = -1.0;
         instance = new InventoryControl();
        expResult = -1.0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 5
         ********/
        System.out.println("\tTest Case #5");
        height = 24.0;
        width = 36.0;
        depth = 49.0;
        instance = new InventoryControl();
        expResult = -1.0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 6
         ********/
        System.out.println("\tTest Case #6");
        height = 0;
        width = 36.0;
        depth = 24.0;
        instance = new InventoryControl();
        expResult = 0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 7
         ********/
        System.out.println("\tTest Case #7");
        height = 24.0;
        width = 0;
        depth = 24.0;
        instance = new InventoryControl();
        expResult = 0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 8
         ********/
        System.out.println("\tTest Case #8");
        height = 24.0;
        width = 36.0;
        depth = 0;
        instance = new InventoryControl();
        expResult = 0;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /********
         * Test Case 9
         ********/
        System.out.println("\tTest Case #9");
        height = 24.0;
        width = 36.0;
        depth = 47.0;
        instance = new InventoryControl();
        expResult = 23.5;
        result = instance.calcVolumeOfCrate(height, width, depth);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    //Kristen Keough Individual Assignment
    /**
     * Test of calcVolumeOfCrate method, of class InventoryControl.
     */
    @Test
    public void calcTireFootprint() {
        System.out.println("calcTireFootprint");
        
        /********
         * Test Case 1
         ********/
        System.out.println("\tTest Case #1");
        //input values for test case 1
        double height = 30.0;
        double width = 8.0;
        
        double expResult = 5.24; // expected output returned value
        
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcTireFootprint(height, width);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        
        /********
         * Test Case 2
         ********/
        System.out.println("\tTest Case #2");
        //input values for test case 1
        height = -1.0;
        width = 8.0;
        
        expResult = -1.0; // expected output returned value
        
        //create instance of InventoryControl class
        instance = new InventoryControl();
        
        //call function to run test
        result = instance.calcTireFootprint(height, width);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        
        /********
         * Test Case 3
         ********/
        System.out.println("\tTest Case #3");
        //input values for test case 1
        height = 30.0;
        width = -1.0;
        
        expResult = -1.0; // expected output returned value
        
        //create instance of InventoryControl class
        instance = new InventoryControl();
        
        //call function to run test
        result = instance.calcTireFootprint(height, width);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        /********
         * Test Case 4
         ********/
        System.out.println("\tTest Case #4");
        //input values for test case 1
        height = 31.0;
        width = 8.0;
        
        expResult = -1.0; // expected output returned value
        
        //create instance of InventoryControl class
        instance = new InventoryControl();
        
        //call function to run test
        result = instance.calcTireFootprint(height, width);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        /********
         * Test Case 5
         ********/
        System.out.println("\tTest Case #5");
        //input values for test case 1
        height = 0.0;
        width = 8.0;
        
        expResult = 0.0; // expected output returned value
        
        //create instance of InventoryControl class
        instance = new InventoryControl();
        
        //call function to run test
        result = instance.calcTireFootprint(height, width);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        /********
         * Test Case 6
         ********/
        System.out.println("\tTest Case #6");
        //input values for test case 1
        height = 30.0;
        width = 0.0;
        
        expResult = 0.0; // expected output returned value
        
        //create instance of InventoryControl class
        instance = new InventoryControl();
        
        //call function to run test
        result = instance.calcTireFootprint(height, width);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
         /**
     * Test of calcWoodForCrates method, of class InventoryControl.
     */
    @Test //Bryce Andrews Test
    
    public void testCalcWoodForCrates() {
        System.out.println("calcWoodForCrates");
               
        /********
         * Test Case 1
         ********/
        System.out.println("\tTest Case #1");
        double crates = 7.0;
        double pallets = 14.0;
        
        double expResult = 0.0;
        
        InventoryControl instance = new InventoryControl();
        
        double result = instance.calcWoodForCrates(crates, pallets);
        
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        
        /********
         * Test Case 2
         ********/
        System.out.println("\tTest Case #2");
        crates = -1.0;
        pallets = 14.0;
        
        expResult = -1.0;
        
        instance = new InventoryControl();
        
        result = instance.calcWoodForCrates(crates, pallets);
        
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                /********
         * Test Case 3
         ********/
        System.out.println("\tTest Case #3");
        crates = 7.0;
        pallets = -1.0;

        expResult = -1.0;
        
        instance = new InventoryControl();

        result = instance.calcWoodForCrates(crates, pallets);

        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                /********
         * Test Case 4
         ********/
        System.out.println("\tTest Case #4");
        crates = 8.0;
        pallets = 14.0;


        expResult = -1.0;
        
        instance = new InventoryControl();

        result = instance.calcWoodForCrates(crates, pallets);

        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                /********
         * Test Case 5
         ********/
        System.out.println("\tTest Case #5");
        crates = 0.0;
        pallets = 14.0;

        expResult = -182.0;
        
        instance = new InventoryControl();

        result = instance.calcWoodForCrates(crates, pallets);

        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                /********
         * Test Case 6
         ********/
        System.out.println("\tTest Case #6");
        crates = 7.0;
        pallets = 0.0;

        expResult = -1.0;
        
        instance = new InventoryControl();

        result = instance.calcWoodForCrates(crates, pallets);

        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                /********
         * Test Case 7
         ********/
        System.out.println("\tTest Case #7");
        crates = 10.0;
        pallets = 20.0;

        expResult = 0.0;
        
        instance = new InventoryControl();

        result = instance.calcWoodForCrates(crates, pallets);

        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
//>>>>>>> 69c6f1e Bryce individual assignment 6
    }

}
    
    

