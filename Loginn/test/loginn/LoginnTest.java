/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0640891
 */
public class LoginnTest {
    
    public LoginnTest() {
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
     * Test of numberOfAs method, of class Loginn.
     */
    @Test
    public void testNumberOfAs() {
        System.out.println("numberOfAs");
        String input = "";
        int expResult = 0;
        int result = Loginn.numberOfAs(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testReturn4(){
        System.out.println("Return4");
        String input = "AAAA";
        int expResult = 4;
        int result = Loginn.numberOfAs(input);
        assertEquals(expResult, result);
}
@Test
public void testdoLogin(){
    System.out.println("doLogin");
    fail("nothing to see here");
}
}
