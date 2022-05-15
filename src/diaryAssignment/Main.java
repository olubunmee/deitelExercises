package diaryAssignment;

public class Main {

    public static void main(String[] args) {

        Diary diary = new Diary("");
        Entry entryOnPage = new Entry("15/05/2022", "09:21", "its sunday", "");

        entryOnPage.addEntry("sdkfdgsyfhdfsga");

        System.out.println("On " + entryOnPage.getDate() + " at " + entryOnPage.getTime());
        System.out.println("Title: " + entryOnPage.getTitle());

        System.out.println(entryOnPage.getEntry());




    }
}
