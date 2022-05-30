package classExercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class implementArrayListTest {
    private ClassArrayList list;

    @BeforeEach
    public void setUp(){
        list = new ClassArrayList();
    }
    @Test
    public void classArrayListCanBeCreated(){
        assertNotNull(list);
    }
    @Test
    public void classArrayListIsEmpty(){
        assertTrue(list.isEmpty());
    }
    @Test
    public void addIntoArrayListTest(){
        list.add("Car");
        assertFalse(list.isEmpty());
    }
    @Test
    public void addMoreThanOneItemTest(){
        list.add("Car");
        list.add("Bike");
        list.add("Motorcycle");
        assertEquals(3, list.size());
    }
    @Test
    public void removeItemFromListTest(){
        list.add("Car");
        list.remove("Car");
        assertTrue(list.isEmpty());
    }
    @Test
    public void addItemToParticularIndex(){
        assertTrue(list.isEmpty());
        list.add(3, "Wheelbarrow");
        assertFalse(list.isEmpty());
    }
    @Test
    public void removeItemFromParticularIndex(){
        assertTrue(list.isEmpty());
        list.add("Car");
        list.add("Bike");
        list.add("Wheelbarrow");
        list.remove(1);
        assertEquals(2, list.size());
    }
    @Test
    public void getItemFromListTest(){
        list.add("Car");
        list.add("Bike");
        list.add("Wheelbarrow");
        list.getItem("Bike");
        assertEquals("Bike", list.getItem("Bike"));
    }
    @Test
    public void getIndexFromListTest(){
        list.add("Car");
        list.add("Bike");
        list.add("Wheelbarrow");
        list.getIndex(2);
        assertEquals("Wheelbarrow", list.getIndex(2));
    }
    @Test
    public void arrayBoundCanBeExpanded(){
        list.add("Car");
        list.add("Bike");
        list.add("Wheelbarrow");
        list.add("Keke");
        list.add("Motorcycle");
        list.add("Leg");
        assertEquals(6, list.size());
    }
    @Test
    public void addMoreThanFiveItems(){
        assertTrue(list.isEmpty());
        list.add(0, "Wheelbarrow");
        list.add(1, "Wheelbarrow");
        list.add(2, "Wheelbarrow");
        list.add(3, "Wheelbarrow");
        list.add(4, "Wheelbarrow");
        list.add(4, "Wheelbarrow");
        list.add(4, "Wheelbarrow");
        assertEquals(7, list.size());
    }
}
