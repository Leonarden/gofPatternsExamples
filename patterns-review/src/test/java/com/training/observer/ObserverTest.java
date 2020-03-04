package com.training.observer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ObserverTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ObserverTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ObserverTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       CSubject subject = new CSubject();
		
		long transmission = 100;
		
		CSuscriber norths = new CSuscriber("NorthStation",subject);
		CSuscriber wests = new CSuscriber("WestStation",subject);
		CSuscriber souths = new CSuscriber("SouthStation",subject);
		
		for(int i=0;i<transmission;i++)
		    subject.computeMetrics();
		
		
        assertTrue( true );
    }
}
