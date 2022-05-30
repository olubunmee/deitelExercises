package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void setUpQueue(){
        queue = new Queue();
    }
    @Test
    public void queueExistsTest(){
        assertNotNull(queue);
    }
    @Test
    public void queueIsEmpty(){
        queue.isEmpty();
        assertTrue(queue.isEmpty());
    }
    @Test
    public void enqueueElementsTest(){
        queue.isEmpty();
        queue.enQueue("Messi");
        assertFalse(queue.isEmpty());
    }
    @Test
    public void enqueueMoreThanOneElementTest(){
        queue.enQueue("Messi");
        queue.enQueue("Ronaldo");
        queue.enQueue("Mbappe");
        queue.enQueue("Neymar");
        assertEquals(4, queue.size());
    }
    @Test
    public void getIndexFromQueue(){
        queue.enQueue("Messi");
        queue.enQueue("Ronaldo");
        queue.enQueue("Mbappe");
        queue.enQueue("Neymar");
        assertEquals("Mbappe", queue.getIndex(2));
    }
    @Test
    public void dequeueElementsTest(){
        queue.enQueue("Messi");
        queue.enQueue("Ronaldo");
        queue.enQueue("Mbappe");
        queue.enQueue("Neymar");
        queue.deQueue();
        assertEquals(3, queue.size());
    }
    @Test
    public void dequeueFirstOnTheQueue(){
        queue.enQueue("Messi");
        queue.enQueue("Ronaldo");
        queue.enQueue("Mbappe");
        queue.enQueue("Neymar");
        assertEquals(4, queue.size());
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        assertEquals(1, queue.size());
    }
}
