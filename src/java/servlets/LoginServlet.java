package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.*;

/**
 *
 * @author 822408
 */
public class LoginServlet extends HttpServlet {
    HttpSession session;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        session = request.getSession();
        
        if (request.getParameter("logout") != null) {
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "logoutSuccess");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        else {
            if (session.getAttribute("username") != null) 
                response.sendRedirect("home");
            else   
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AccountService accountService = new AccountService();
        
        if (accountService.login(username, password) == null) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("message", "invalidLogin");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        else {
            session.setAttribute("username", username);
            response.sendRedirect("home");
        }
    }

}
