package servlets;


import rsoi.DataObject.StateProgDoc;
import rsoi.dao.Dao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;

/**
 * Created by madina on 06.06.14.
 */
public class getStateProgDocServlet extends HttpServlet {
    private static final long serialVersionUID = 1777792322731387797L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {


            List<StateProgDoc> items = new Dao().getAllStateProgDoc();
            request.getSession().setAttribute("items", items);

            RequestDispatcher disp = getServletContext().getRequestDispatcher("/index.jsp");
            if (disp != null) {
                disp.forward(request, response); }


        } catch (Exception e) {
            e.printStackTrace();
            request.getSession().setAttribute("errorMsg", "Î??á?? â ??î??î??? ????ó?? ç??â??");
            RequestDispatcher disp = getServletContext().getRequestDispatcher("/error.jsp");
            if (disp != null) {
                disp.forward(request, response);
            }
        }
    }
}
