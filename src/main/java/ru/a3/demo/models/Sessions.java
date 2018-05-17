package ru.a3.demo.models;

public class Sessions {
    private final long id;
    private final String content;

    public Sessions(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
