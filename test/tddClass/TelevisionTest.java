package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void turnOnTelevision(){
        Television samsung = new Television();
        samsung.turnOn(true);
        assertTrue(samsung.isOn());
    }

    @Test
    public void turnOffTelevision(){
        Television samsung = new Television();
        samsung.turnOn(false);
        assertTrue(samsung.isOn());
    }

    @Test
    public void setChannel(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        assertEquals(5, samsung.getChannel());
    }

    @Test
    public void nextChannel(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        assertEquals(8, samsung.getChannel());
    }

    @Test
    public void previousChannel(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.previousChannel();
        samsung.previousChannel();
        assertEquals(6, samsung.getChannel());
    }

    @Test
    public void increaseVolume(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.volumeUp();
        assertEquals(26, samsung.getVolume());
    }

    @Test
    public void reduceVolume(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        assertEquals(20, samsung.getVolume());
    }

    @Test
    public void notExceedTenChannels(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        samsung.nextChannel();
        assertEquals(1, samsung.getChannel());
    }

    @Test
    public void notExceedTenChannelsTwo(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.previousChannel();
        samsung.previousChannel();
        samsung.previousChannel();
        samsung.previousChannel();
        samsung.previousChannel();
        assertEquals(10, samsung.getChannel());
    }

    @Test
    public void volumeNotMoreThanThirty(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        assertEquals(30, samsung.getVolume());
    }

    @Test
    public void volumeNotLessThanZero(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        assertEquals(0, samsung.getVolume());
    }

    @Test
    public void mute(){
        Television samsung = new Television();
        samsung.turnOn(true);
        samsung.setChannel();
        samsung.volumeUp();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.volumeDown();
        samsung.muteTv();
        assertEquals(0, samsung.getVolume());
    }
}
