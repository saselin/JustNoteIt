package de.thb.justnoteit.manager;

import de.thb.justnoteit.entity.*;
import de.thb.justnoteit.repository.NotebookDirectoryDA;

import java.util.ArrayList;
import java.util.List;

public class DeskManager {
    private NotebookDirectoryDA notebookDirectory;

    public DeskManager() {
        this.notebookDirectory = new NotebookDirectoryDA();
    }

    public de.thb.justnoteit.entity.Notebook getNotebook(long nbId) throws Exception{
        de.thb.justnoteit.entity.Notebook notebook = this.notebookDirectory.findById(nbId);
        if (notebook != null) {
            return notebook;
        } else {
            throw new Exception("Notebook mit Id: " + nbId + " existiert nicht");
        }
    }

    public ArrayList<de.thb.justnoteit.entity.Notebook> getAllNotebooks() {
        return this.notebookDirectory.findALL();
    }
}
