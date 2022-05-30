package tddClass;

public class Bike {

    private int accelerate;

    private int deccelerate = 45;

    public void turnOn(boolean on) {
    }

    public void turnOff(boolean off) {
    }

    public boolean isOn() {
        return true;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public void accelerate() {
        accelerate++;
        if (accelerate >= 21 && accelerate <= 30){accelerate = (accelerate + 1);}
        else if (accelerate >= 31 && accelerate <= 40){accelerate = (accelerate + 2);}
        else if (accelerate >= 41 && accelerate <= 50) accelerate = (accelerate + 3);
    }

    public int getDeccelerate() {
        return deccelerate;
    }

    public void deccelerate() {
        deccelerate--;
        if (deccelerate <= 40 && deccelerate >= 31){deccelerate = (deccelerate - 1);}
        else if (deccelerate <= 30 && deccelerate >= 21){deccelerate = (deccelerate - 2);}
        else if (deccelerate <= 20 && deccelerate >= 0){deccelerate = (deccelerate - 3);}
    }
}
