package servlets;

import rsoi.dao.Dao;
import rsoi.DataObject.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by madina on 06.06.14.
 */
public class AuthorizeServlet extends HttpServlet {
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

            String login = request.getParameter("login");
            String pwd = request.getParameter("pwd");
            User user = new Dao().authorizeUser(login, pwd);

            request.getSession().setAttribute("user", user);

            if (user == null) {
                request.getSession().setAttribute("errorMsg", "?????? ???????? ?????? ??? ?????.");
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/error.jsp");
                if (disp != null) {
                    disp.forward(request, response);
                }
            } else {
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/index.jsp");
                if (disp != null) {
                    disp.forward(request, response);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.getSession().setAttribute("errorMsg", "Error");
            RequestDispatcher disp = getServletContext().getRequestDispatcher("/error.jsp");
            if (disp != null) {
                disp.forward(request, response);
            }
        }
    }
}
