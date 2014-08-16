package rsoi.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rsoi.model.IModel;
import rsoi.model.ModelImpService;
import rsoi.model.User;

/**
 * Created by madina on 06.06.14.
 */
public class RegisterServlet extends HttpServlet{
    private static final long serialVersionUID = -6184770725730430352L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * ?’?‹?????»?????µ?‚ ?·?°???€???? ?? ?´?¸?????µ?‚?‡?µ?€???????? ???¸???‚?µ???µ ?´?»?? ?€?µ???¸???‚?€?°?†?¸?¸ ???????????? ?????»???·?????°?‚?µ?»??.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ModelImpService service = new ModelImpService();
            IModel port = service.getModelImpPort();
            boolean result;

            User user = new User();
            user.setGuid("USER");
            user.setName(request.getParameter("name"));
            user.setLname(request.getParameter("lname"));
            user.setMname(request.getParameter("mname"));
            user.setLogin(request.getParameter("login"));
            user.setPwd(request.getParameter("pwd"));

            result = true;//port.registerNewUser(user);

            if (result) {
                request.getSession().setAttribute("registered", true);
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/home.jsp");
                if (disp != null) {
                    disp.forward(request, response);
                }
            } else {
                request.getSession().setAttribute("errorMsg", "Error register user");
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/error.jsp");
                if (disp != null) {
                    disp.forward(request, response);
                }
            }

        } catch (Exception e) {
            request.getSession().setAttribute("errorMsg", "Error service IModel");
            RequestDispatcher disp = getServletContext().getRequestDispatcher("/error.jsp");
            if (disp != null) {
                disp.forward(request, response);
            }
        }
    }
}
