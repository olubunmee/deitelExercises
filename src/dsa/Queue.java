package dsa;

import java.util.Arrays;

public class Queue {
    private String [] playersArray = new String[5];

    private int inputIntoQueue = 0;

    public boolean isEmpty(){
        return inputIntoQueue == 0;
    }

    public void enQueue(String player) {
        playersArray[inputIntoQueue] = player;
        inputIntoQueue++;
    }

    public int size() {
        return inputIntoQueue;
    }

    public void deQueue() {
        String[] newArray = new String[playersArray.length];
/*        for (int i = playersArray.length - 1; i >= 0 ; i--) {
            playersArray[i - 1] = playersArray[i];
        }*/
        System.arraycopy(playersArray, 1, newArray, 0, playersArray.length-1);
/*        for (int i = 1; i <= playersArray.length - 1; i++) {
            newArray[i-1] = playersArray[i];
        }
        playersArray = newArray;*/
        inputIntoQueue--;
    }

    public String getIndex(int index) {
        return playersArray[index];
    }
}
