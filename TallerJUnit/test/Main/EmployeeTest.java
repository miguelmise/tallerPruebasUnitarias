/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCs() {
        System.out.println("cs");    
        Employee instance = new Employee(100.0F,"USD",1.0F,EmployeeType.Manager);
        float expResult = 165.03332F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonus() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(100.0F,"USD",1.0F,EmployeeType.Manager);
        float expResult = 486.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
