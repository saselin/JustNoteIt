package de.thb.justnoteit.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.thb.justnoteit.entity.Note;
import de.thb.justnoteit.entity.Notebook;
import de.thb.justnoteit.manager.DeskManager;

/**
 * Servlet implementation class NotebookController
 */
@WebServlet("/DetailController")
public class DetailController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private DeskManager deskManager;

    public DetailController() {
        super();
        deskManager = new DeskManager();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Notebook notebook;
        try {
            notebook = deskManager.getNotebook(Long.valueOf(request.getParameter("id")));

            response.getWriter().append("\r\nNotizbuch:" + notebook.getName() +"\r\n");

            for(Note note : notebook.getNotes()) {
                response.getWriter().append(note.getId() + "- " + note.getTitle() + "\r\n");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}