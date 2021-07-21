package com.softserve.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet({ "/Login", "/login", "/" })
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        /*-
        PrintWriter out = response.getWriter();
        String box = request.getParameter("box");
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello</h1><br><br><br>");
        out.println("<br><font size=\"5\" color='red'> URL = " + request.getRequestURL().toString() + "</font><br>");
        out.println("<br><font size=\"5\" color='green'> URI = " + request.getRequestURI().toString() + "</font><br>");
        if ((box != null) && (box.length() > 0)) {
            out.println("<br><br>This is box = " + box + "<br><br><br>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
        */
        //
        getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,
                response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        //doGet(request, response);
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String result = "invalid user or password";
        if ((name != null) && (name.length() > 0) && (name.equalsIgnoreCase("ivan")) && (password != null)
                && (password.length() > 0) && (password.equalsIgnoreCase("qwerty"))) {
            result = "Welcome";
        }
        String serverPath = "http://" + request.getServerName() + ":" + request.getServerPort() + "/dev";
        //System.out.println("server name = " + request.getServerName());
        //System.out.println("Servlet Path = " + request.getServletPath());
        //
        response.setContentType("text/html");
        //response.setContentType("application/zip");
        //
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello</h1><br><br><br>");
        if (result.equalsIgnoreCase("Welcome")) {
            out.println("<br><font size=\"5\" color='green'> Message = " + result + "</font><br>");
            out.println("<br><br><a href=\"" + serverPath + "/security\">Security information</a>");
            /*-
            out.println("<br><form action=\"/dev/security\" method=\"post\">" 
                    + "<br> Get Information: "
                    + "<input type=\"submit\" value=\"goto\">"
                    + "</form>"
                    );
            */
            HttpSession session = request.getSession(true);
            //Cookie cookie = new Cookie("lv595", session.getId());
            Cookie cookie = new Cookie("lv595", "123456789");
            response.addCookie(cookie);
        } else {
            out.println("<br><font size=\"5\" color='red'> Message = " + result + "</font><br>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}