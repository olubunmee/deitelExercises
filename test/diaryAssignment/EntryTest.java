package diaryAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {

    @Test
    public void entryCanBeCreated(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        assertNotNull(entry);
    }

    @Test
    public void entryIsEmpty(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        assertTrue(entry.isEmpty());
    }

    @Test
    public void dateCanBeSet(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        entry.setDate("29/03/1995");
        assertEquals("29/03/1995", entry.getDate());
    }

    @Test
    public void timeCanBeSet(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        entry.setTime("01:06am");
        assertEquals("01:06am", entry.getTime());
    }

    @Test
    public void titleCanBeWritten(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        entry.setTitle("New diary entry");
        assertEquals("New diary entry", entry.getTitle());
    }

    @Test
    public void entryCanBeAdded(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        entry.addEntry("Write whatever");
        assertFalse(entry.isEmpty());
    }
    @Test
    public void entryCanBeRemoved(){
        Entry entry = new Entry("04/05/2022", "12:00am", "Dear Diary");
        entry.addEntry("Write whatever");
        entry.removeEntry();
        assertTrue(entry.isEmpty());
    }
}
