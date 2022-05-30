package dsa;
import java.util.ArrayList;

public class Set {

    private final ArrayList<String>list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void addItem(String item) {
        if (!list.contains(item))
            list.add(item);
    }

    public void remove(String item) {
        list.remove(item);
    }

    public int size() {
        return list.size();
    }

    public String getIndex(int idx) {
        return list.get(idx);
    }
}

