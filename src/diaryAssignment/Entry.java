package diaryAssignment;

import java.time.LocalDateTime;

public class Entry{

    private String title;
    private String body;
    private final LocalDateTime date = LocalDateTime.now();

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getDate() {
        return date;
    }
}


