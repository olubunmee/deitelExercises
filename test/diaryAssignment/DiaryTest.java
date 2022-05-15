package diaryAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {


    @Test
    public void diaryCanBeCreated(){
        Diary diary = new Diary("");
        assertNotNull(diary);
    }
    @Test
    public void diaryCanBeLocked(){
        Diary diary = new Diary("");
        diary.isLocked("");
        assertTrue(diary.isLocked(""));
    }

    @Test
    public void diaryCanBeUnlocked(){
        Diary diary = new Diary("");
        diary.isLocked("1234");
        assertFalse(diary.isLocked("1234"));
    }
}
