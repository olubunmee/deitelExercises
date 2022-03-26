package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {


    @Test
    public void testForHuman(short bunmi){
        Human oneHuman = new Human();
        oneHuman.name = ("bunmi");
        assertEquals(bunmi, oneHuman.getName());
    }
}
