package de.thb.justnoteit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notebook {
    private long id;
    private String name, description, cover;
    private Date published;
    private List<de.thb.justnoteit.entity.Note> notes ;

    public Notebook(long id, String name, String description, String cover, Date published) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cover = cover;
        this.published = published;
        notes = new ArrayList<de.thb.justnoteit.entity.Note>();
    }

    public Notebook()
    {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public List<Note> getNotes()
    {
        return notes;
    }
    public int getNumberOfNotes()
    {
        return notes.size();
    }
}
