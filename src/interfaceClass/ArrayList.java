package interfaceClass;

public class ArrayList implements List {

    private int counter = 0;
    private int capacity = 5;
    private String[] array = new String[capacity];

    @Override
    public void add(String item) {
        array[counter] = item;
        counter++;
    }

    @Override
    public void add(int index, String item) {
        for (int i = 0; i < array.length; i++) {
            array[index] = item;
        }
    }

    @Override
    public void remove(String item) {
        array[counter] = item;
        counter--;
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public String getItem(String item) {
        return array[counter] = item;
    }

    @Override
    public void remove(int index) {
        counter--;
    }

    @Override
    public int size() {
        return counter;
    }

    public void increaseSize(){
        int newDb = capacity * 2;
        String[] newArray = new String[newDb];

        for (int i = 0; i < size(); i++) {
            newArray[i] = array[i];
        }
        capacity = newDb;
        array = newArray;
    }
}
