package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

    private HashMap map;

    @BeforeEach
    public void setUp(){
        map = new HashMap();
    }

    @Test
    public void hashMapExistsTest(){
        assertNotNull(map);
    }
    @Test
    public void hashMapIsEmptyTest(){
        map.isEmpty();
        assertTrue(map.isEmpty());
    }
    @Test
    public void putIntoHashMapTest(){
        map.put(0, 1);
        assertFalse(map.isEmpty());
    }
    @Test
    public void removeFromHashMap(){
        map.put(0, 1);
        map.remove(1);
        assertTrue(map.isEmpty());
    }
    @Test
    public void getKeyTest(){
        map.put(0, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.get(3);
        assertTrue(map.containsValue(3));
    }
}
