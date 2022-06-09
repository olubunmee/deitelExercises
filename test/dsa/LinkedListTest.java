package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
}
