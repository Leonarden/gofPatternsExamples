package com.training.decorator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DecoratorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DecoratorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DecoratorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       Vehicle vehicle = new Car();
 
        assertNotNull(vehicle);
    	System.out.println("Car : " + vehicle.getLabel() + " Cost:" + vehicle.getCost() + " Weight: " + vehicle.getWeight());
    	
    	vehicle = new SuperTurbo(vehicle);
    	assertNotNull(vehicle);
    	System.out.println("Car : " + vehicle.getLabel() + " Cost:" + vehicle.getCost() + " Weight: " + vehicle.getWeight());
    	
    	vehicle = new Aerodynamics(vehicle);
    	assertNotNull(vehicle);
    	System.out.println("Car : " + vehicle.getLabel() + " Cost:" + vehicle.getCost() + " Weight: " + vehicle.getWeight());
    	
    	
    	
 
    }
}
