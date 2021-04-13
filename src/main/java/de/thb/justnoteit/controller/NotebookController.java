package de.thb.justnoteit.controller;

import de.thb.justnoteit.entity.Notebook;
import de.thb.justnoteit.manager.DeskManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/notebooks")
public class NotebookController extends HttpServlet {
    private static final long serialVersionUID = 1;
    private DeskManager deskManager;
    public NotebookController() {
        super();
        deskManager = new DeskManager();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().append("\r\nMeine Notizbücher:\r\n");

        ArrayList<Notebook> notebookList = deskManager.getAllNotebooks();
        for(Notebook notebook : notebookList){
            response.getWriter().append(notebook.getId() + "-" + notebook.getName() +"\r\n");
        }
    }
}