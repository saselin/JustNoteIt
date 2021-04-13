package de.thb.justnoteit.repository;

import de.thb.justnoteit.entity.Note;
import de.thb.justnoteit.entity.Notebook;

import java.sql.Date;
import java.util.ArrayList;

public class NotebookDirectoryDA {
    private ArrayList<Notebook> notebooks;

    public NotebookDirectoryDA () {
        notebooks = new ArrayList<Notebook>();
        ArrayList<Note> notes = new ArrayList<Note>();
        notes.add(new Note(465498432,"NoteTest","dfahsdöfhw"));
        Notebook nb = new Notebook(468498623,"TestNB", "bbla", "Irgendwas", Date.valueOf("2012-04-23"));
        notebooks.add(nb);
    }
    public ArrayList<Notebook> findALL()
    {
        return notebooks;
    }
    public Notebook findById(long id)
    {
        for (Notebook nb : notebooks)
        {
            if(nb.getId()==id) return nb;
        }
        return null;
    }
    public ArrayList<Notebook> findByTitle(String title)
    {
        ArrayList<Notebook> nbs= new ArrayList<Notebook>();
        for (Notebook nb : notebooks)
        {
            if(nb.getName().equals(title)) nbs.add(nb);
        }
        return nbs;
    }
}