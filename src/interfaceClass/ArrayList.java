package interfaceClass;

public class ArrayList implements List {

    private int counter = 0;
    private String[] db = new String[5];

    @Override
    public void add(String item) {
        db[counter] = item;
        counter++;
    }

    @Override
    public void add(int index, String item) {
        for (int i = 0; i < db.length; i++) {
            db[index] = item;
        }
    }

    @Override
    public void remove(String item) {
        db[counter] = item;
        counter--;
    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public String getItem(String item) {
        return db[counter] = item;
    }

    @Override
    public void remove(int index) {
        counter--;
    }

    @Override
    public int size() {
        return counter;
    }
}
