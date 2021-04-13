package de.thb.justnoteit.entity;

public class Note {
    long id;
    String title, description;
    Boolean done;

    public Note(long id, String title, String description)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        done = false;
    }
    public Note()
    {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
