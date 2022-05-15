package interfaceClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void addTest(){
        List list = new ArrayList();
        list.add("Clothes");
        assertEquals(1, list.size());
    }

    @Test
    public void removeTest(){
        List list = new ArrayList();
        list.add("Clothes");
        list.add("Clothes");
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    public void addAndGetTest(){
        List list = new ArrayList();
        list.add("Clothes");
        list.add("Shoes");
        assertEquals("Clothes", list.get(0));
        assertEquals("Shoes", list.get(1));
    }

    @Test
    public void addToAParticularIndex(){
        List list = new ArrayList();
        list.add(4, "Watch");
        assertEquals("Watch", list.get(4));
    }

    @Test
    public void removeParticularItem(){
        List list = new ArrayList();
        list.add("Clothes");
        list.add("Shoes");
        list.add("Watches");
        assertEquals(3, list.size());
        list.remove("Watches");
        assertEquals(2, list.size());
    }

    @Test
    public void getParticularItem(){
        List list = new ArrayList();
        list.add("Clothes");
        list.add("Shoes");
        list.add("Watches");
        assertEquals("Clothes", list.getItem("Clothes"));
    }

    @Test
    public void arrayCanBeExpanded(){
        List list = new ArrayList();
        list.add("Clothes");
        list.add("Shoes");
        list.add("Watches");
        list.add("Cars");
        list.add("Chains");
        assertEquals(5, list.size());
        list.add("PlayStation");
        assertEquals(6, list.size());

    }



}