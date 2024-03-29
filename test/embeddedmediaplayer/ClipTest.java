/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    public ClipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue()
    {
       
          System.out.println("setTitle");
          Clip instance = new Clip();
          String OriginalTitle = "Original Title";
          instance.setTitle(OriginalTitle);              
          String EmptyTitle = "";
          instance.setTitle(EmptyTitle);              
          String ModifiedTitle = instance.getTitle(); 
          assertTrue(OriginalTitle.equals(ModifiedTitle));
          System.out.println("Empty Title is not set"); 
    }

    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
        System.out.println("Doesn't allow to set end time to start time");
        Clip instance = new Clip();
        String OriginalTitle = "Sub video"; 
        instance.setTitle(OriginalTitle);
        int OriginalStartTime = 10; 
        int OriginalEndTime = 40;
        instance.setMax(100);
        instance.setStart(OriginalStartTime);
        instance.setEnd(OriginalEndTime);
        int CurrentStartTime = instance.getStart();
        int CurrentEndTime = instance.getEnd();
        instance.setStart(CurrentEndTime);
        assertEquals(OriginalStartTime,CurrentStartTime);
        System.out.println("Start time is same as previous value");
    }

    @Test
    public void testEqualsOnEqualClips() 
    {
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
    }
    
    @Test
    public void testSetEndToNegativeNumberKeepsPreviousValue() 
    {
    }
    
    @Test
    public void testSetStartToValidPositiveNumber() 
    {    
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Clip instance = new Clip();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Clip.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String s = "";
        Clip instance = new Clip();
        instance.setTitle(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class Clip.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Clip instance = new Clip();
        int expResult = 0;
        int result = instance.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart method, of class Clip.
     */
    @Test
    public void testSetStart() {
        System.out.println("setStart");
        Integer start = null;
        Clip instance = new Clip();
        instance.setStart(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class Clip.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        Clip instance = new Clip();
        int expResult = 0;
        int result = instance.getEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd method, of class Clip.
     */
    @Test
    public void testSetEnd() {
        System.out.println("setEnd");
        Integer end = null;
        Clip instance = new Clip();
        instance.setEnd(end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class Clip.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        Clip instance = new Clip();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class Clip.
     */
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        Integer max = null;
        Clip instance = new Clip();
        instance.setMax(max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Clip.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Clip anotherClip = null;
        Clip instance = new Clip();
        boolean expResult = false;
        boolean result = instance.equals(anotherClip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Clip.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Clip instance = new Clip();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toCSV method, of class Clip.
     */
    @Test
    public void testToCSV() {
        System.out.println("toCSV");
        Clip instance = new Clip();
        String expResult = "";
        String result = instance.toCSV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadCSVLine method, of class Clip.
     */
    @Test
    public void testLoadCSVLine() {
        System.out.println("loadCSVLine");
        String s = "";
        Clip instance = new Clip();
        instance.loadCSVLine(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
}
