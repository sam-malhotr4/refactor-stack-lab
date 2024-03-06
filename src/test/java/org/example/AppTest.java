package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testPush()
    {
        MyStack<Object> myStack = new MyStack<>();
        myStack.push(1);
        assertFalse(myStack.isEmpty());
    }

    public void testPop()
    {
        MyStack<Object> myStack = new MyStack<>();
        myStack.push(1);
        assertEquals(1, myStack.pop());
    }
}
