package com.training.adapter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AdapterTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AdapterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AdapterTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	EUFacility euFacility = new EUFacility("EUROS");
    	USFacility usFacility = new USFacility("DOLLARS");
    	
    	InternationalFacilityAdapter adapter = new InternationalFacilityAdapter(euFacility);
    	
    	System.out.println("Adapting european facilities");
    	
    	adapter.buy();
    	
    	adapter.sell();
    	
    	System.out.println("Adapting american facilities");
    	
    	adapter = new InternationalFacilityAdapter(usFacility);
    	
    	adapter.buy();
    	
    	adapter.sell();
    	
    	
    		
    	
        assertTrue( true );
    }
}
