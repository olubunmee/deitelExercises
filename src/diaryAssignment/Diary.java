package diaryAssignment;

public class Diary {

    private String pin;

    public Diary(String pin) {
        this.pin = pin;
    }

    public boolean isLocked(String pin) {
        return this.pin == pin;
    }

}
