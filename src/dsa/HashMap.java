package dsa;

public class HashMap implements HashMapList{

    private int intoHashMap = 0;

    private int [] array = new int[10];


    public boolean isEmpty() {
        return intoHashMap == 0;
    }

    @Override
    public void put(int key, int value) {
        array[key] = value;
        intoHashMap++;
    }

    @Override
    public void remove(int value) {
        for (int i = 0; i < array.length; i++) {
            array[intoHashMap] = value;
        }
        intoHashMap--;
    }

    @Override
    public boolean containsKey(int key) {
        for (int i = 0; i < array.length; i++) {
            if (i == key)
                return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (i == value)
                return true;
        }
        return false;
    }

    @Override
    public void replace(int key, int value) {


    }

    @Override
    public int get(int key) {
        for (int i = 0; i < array.length + 1; i++) {
            if (key != intoHashMap)
                return -1;
        }
        return key;
    }
}
