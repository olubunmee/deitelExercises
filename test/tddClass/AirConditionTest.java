package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void airConditionerOn(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOn();
        assertTrue(thermocool.getIsOn());
    }

    @Test
    public void airConditionerOff(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOff();
        assertTrue(thermocool.getIsOn());
    }

    @Test
    public void increaseTemp(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOn();
        thermocool.increaseTemp();
        assertEquals(17, thermocool.getTemperature());
    }

    @Test
    public void reduceTemp(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOn();
        thermocool.increaseTemp();
        thermocool.reduceTemp();
        assertEquals(16, thermocool.getTemperature());
    }

    @Test
    public void temperatureToThirty(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOn();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        assertEquals(30, thermocool.getTemperature());
    }

    @Test
    public void temperatureNotMoreThanThirty(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOn();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        assertEquals(30, thermocool.getTemperature());
    }

    @Test
    public void temperatureNotLessThanSixteen(){
        AirConditioner thermocool = new AirConditioner();
        thermocool.turnOn();
        thermocool.increaseTemp();
        thermocool.reduceTemp();
        thermocool.reduceTemp();
        assertEquals(16, thermocool.getTemperature());
    }
}
