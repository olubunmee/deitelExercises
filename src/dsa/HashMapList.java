package dsa;

public interface HashMapList {

    void put(int key, int value);

    void remove(int value);

    boolean containsKey(int key);

    boolean containsValue(int value);

    void replace(int key, int value);

    int get(int key);

}
