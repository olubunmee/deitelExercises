package tddClass;

public class Television {

    private boolean isOn;
    private int isMute;
    private int volume = 25;
    private int channel = 5;

    public Television() {
    }

    public void turnOn(boolean on) {
    }

    public boolean isOn() {
        return true;
    }

    public void setChannel() {
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        channel++;
        if (channel > 10) channel = 1;
    }

    public void previousChannel() {
        channel--;
        if (channel < 1) channel = 10;
    }

    public int getVolume() {
        return volume;
    }

    public void volumeUp() {
        volume++;
        if (volume > 30) volume = 30 ;
    }

    public void volumeDown() {
        volume--;
        if (volume < 0) volume = 0;
    }

    public int muteTv() {
       // if(isMute);
        return 0;
    }
}
