package tddClass;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public AirConditioner(){
        temperature = 16;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = true;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemp() {
        temperature++;
        if (temperature > 30){temperature = 30;}
    }

    public void reduceTemp() {
        temperature--;
        if (temperature < 16){temperature = 16;}
    }
}
