package com.training.abstractfactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AbstractFactoryTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AbstractFactoryTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AbstractFactoryTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	RobotFactory usfactory = new USRobotFactory();
    	Robot robotus = usfactory.orderRobot("C3PO", "F");
    	
    	assertTrue(robotus!=null);
    	
    	RobotFactory jpfactory = new JPRobotFactory();
    	
    	Robot robotjp = jpfactory.orderRobot("R2C2", "M");
    	
        assertTrue( robotjp!=null );
    }
}
