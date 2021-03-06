package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringStackTest
{
    public Stack s;
    public Stack stack;
    public Stack s2;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
        s2 = new StringStack(1);
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
        s.push("testString");
        assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("String1");
        s.push("String2");
        s.push("String3");
        //----------------------
        // s.pop();
        // s.pop();
        // s.pop();
        assertEquals("String3",s.pop());
        assertEquals("String2",s.pop());
        assertEquals("String1",s.pop());

        assertTrue(s.isEmpty());


    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    @Test (expected = IllegalArgumentException.class)
    public void testStackCapacity() throws Exception{
        stack=new StringStack(-1);
    }

    @Test ( expected = IllegalStateException.class)
    public void testPushInFullStack() throws Exception{
        s2.push("String1");
        s2.push("String2");
    }

    @Test (expected = IllegalStateException.class)
    public void testPopfromEmptyStack() throws Exception{
        s2.pop();
    }
}
