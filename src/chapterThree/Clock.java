package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23)
            this.hour = 0;
        else this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59)
            this.minute = 0;
        else this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59)
            this.second = 0;
        else this.second = second;
    }

    public String displayTime(){
        return this.hour + "hh " + this.minute + "mm " + this.second + "ss ";
    }
}
