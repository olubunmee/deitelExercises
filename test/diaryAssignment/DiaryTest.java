package diaryAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {


    @Test
    public void diaryCanBeCreated(){
        Diary diary = new Diary();
        assertNotNull(diary);
    }

    public void diaryCanBeLocked(){
        Diary diary = new Diary();
        diary.pin("1234");
    }
}
