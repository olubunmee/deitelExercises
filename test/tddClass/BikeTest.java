package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @Test
    public void turnOnBike(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        assertTrue(cruiser.isOn());
    }

    @Test
    public void turnOffBike(){
        Bike cruiser = new Bike();
        cruiser.turnOff(true);
        assertTrue(cruiser.isOn());
    }

    @Test
    public void accelerate(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.accelerate();
        assertEquals(1, cruiser.getAccelerate());
    }

    @Test
    public void accelerateGearOne(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        assertEquals(20, cruiser.getAccelerate());
    }

    @Test
    public void accelerateGearTwo(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        assertEquals(28, cruiser.getAccelerate());
    }

    @Test
    public void gearThree(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        assertEquals(33, cruiser.getAccelerate());
    }

    @Test
    public void gearFour(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        cruiser.accelerate();
        assertEquals(39, cruiser.getAccelerate());
    }

    @Test
    public void deccelerate(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.deccelerate();
        assertEquals(44, cruiser.getDeccelerate());
    }

    @Test
    public void deccelerateGearOne(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        assertEquals(41, cruiser.getDeccelerate());
    }

    @Test
    public void deccelerateGearTwo(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        assertEquals(39, cruiser.getDeccelerate());
    }

    @Test
    public void deccelerateGearThree(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        assertEquals(28, cruiser.getDeccelerate());
    }

    @Test
    public void deccelerateGearFour(){
        Bike cruiser = new Bike();
        cruiser.turnOn(true);
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        cruiser.deccelerate();
        assertEquals(18, cruiser.getDeccelerate());
    }
}
