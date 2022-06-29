package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList list;

    @BeforeEach
    public void setup(){
        list = new LinkedList();
    }
    @Test
    public void linkedListCanBeCreated(){
        assertNotNull(list);
    }

    @Test
    public void linkedListIsEmptyTest(){
        list.isEmpty();
        assertTrue(list.isEmpty());
    }

    @Test
    public void linkedListCanInsert(){
        list.addFirst(30);
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(40);
        assertEquals(4, list.getSize());
    }
}
