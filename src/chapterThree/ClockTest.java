package chapterThree;

public class ClockTest {

    public static void main(String[] args) {

        Clock clock = new Clock();

        clock.setHour(23);
        clock.setMinute(45);
        clock.setSecond(35);

        clock.displayTime();
        System.out.println(clock.displayTime());

    }
}
