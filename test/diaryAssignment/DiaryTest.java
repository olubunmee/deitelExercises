package diaryAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;
    @BeforeEach
    public void setUp(){
        diary = new Diary(true, "");
    }
    @Test
    public void diaryCanBeCreated(){
        assertNotNull(diary);
    }
    @Test
    public void diaryIsLockedByDefault(){
        diary.isLocked();
        assertTrue(diary.isLocked());
    }
    @Test
    public void diaryCanBeUnlocked(){
        diary.isLocked();
        diary.Unlock("");
        assertFalse(diary.isLocked());
    }
    @Test
    public void diaryCanBeLocked(){
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test
    public void passwordCanBeChanged(){
        diary.Unlock("");
        diary.changePassword("qwerty");
        diary.lock();
        diary.Unlock("qwerty");
        assertFalse(diary.isLocked());
    }
    @Test
    public void diaryHasAnEntry(){
        diary.Unlock("");
    }
}
