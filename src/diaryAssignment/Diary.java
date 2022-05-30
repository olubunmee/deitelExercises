package diaryAssignment;

import java.util.ArrayList;

public class Diary {

    private boolean isLocked;
    private String password;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(boolean isLocked, String password) {
        this.isLocked = isLocked;
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void Unlock(String password) {
        if (this.password.equals(password))
            isLocked = false;
    }
    public void lock() {
        isLocked = true;
    }
    public void changePassword(String password) {
        this.password = password;
    }
    public Entry createEntry(String title, String body){
        return new Entry(title, body);
    }
    public void addEntry(Entry entry){
        entries.add(entry);
    }
    public void removeEntry(Entry entry){
        entries.remove(entry);
    }
    public String searchEntry(String title){
        for (Entry entry : entries) {
            if (entry.getTitle().equals(title))
                return title;
        }
        return "not found";
    }
    public void deleteEntry(String title){
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title))
                entries.remove(entry);
        }
    }
    public void getTotalNumberOfEntries(){
        entries.size();
    }
}
