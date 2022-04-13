package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void stackCanBeCreatedTest(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }

    @Test
    public void isEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneElement(){
        Stack stack = new Stack();
        stack.push(2);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void popElement(){
        Stack stack = new Stack();
        stack.push(2);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushAndPopElements(){
        Stack stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushAndPopSameElements(){
        Stack stack = new Stack();
        stack.push(10);
        int element = stack.pop();
        assertEquals(10, element);
    }

    @Test
    public void pushAndPopTwoDifferentElements(){
        Stack stack = new Stack();
        stack.push(20);
        stack.push(50);
        int element = stack.pop();
        assertEquals(50, element);
        element = stack.pop();
        assertEquals(20, element);
    }

    @Test
    public void pushAndPeek(){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        int element = stack.peek();
        assertEquals(20, element);
        element = stack.pop();
        assertEquals(20, element);
        element = stack.peek();
        assertEquals(10, element);
    }
}
