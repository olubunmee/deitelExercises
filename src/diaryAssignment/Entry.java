package diaryAssignment;

public class Entry {

    private String date;
    private String time;
    private String title;
    private int numberOfEntries;
    private String [] enter = new String[6];

    public boolean isEmpty(){
        return this.numberOfEntries == 0;
    }

    public Entry(String date, String time, String title) {
        this.date = date;
        this.time = time;
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addEntry(String entry) {
        enter[numberOfEntries] = entry;
        numberOfEntries++;
    }

    public void removeEntry() {
        numberOfEntries--;
    }
}
