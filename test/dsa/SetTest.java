package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set set;

    @BeforeEach
    public void setUpSet(){
        set = new Set();
    }
    @Test
    public void setCanBeCreated(){
        assertNotNull(set);
    }
    @Test
    public void setIsEmpty(){
        set.isEmpty();
        assertTrue(set.isEmpty());
    }
    @Test
    public void setCanAddItems(){
        setIsEmpty();
        set.addItem("FIFA");
        set.addItem("NFL");
        assertFalse(set.isEmpty());
    }
    @Test
    public void itemsCanBeRemovedFromSet(){
        setIsEmpty();
        set.addItem("FIFA");
        set.addItem("NFL");
        set.remove("NFL");
        set.remove("FIFA");
        assertEquals(0, set.size());
    }
    @Test
    public void getIndexOfItem(){
        set.addItem("FIFA");
        set.addItem("NFL");
        set.getIndex(1);
        assertEquals("NFL", set.getIndex(1));
    }
    @Test
    public void cannotAddDuplicateItemsTest(){
        set.addItem("FIFA");
        set.addItem("FIFA");
        set.addItem("NFL");
        set.addItem("NHL");
        set.addItem("NHL");
        set.addItem("NFL");
        assertEquals(3, set.size());
    }
}
