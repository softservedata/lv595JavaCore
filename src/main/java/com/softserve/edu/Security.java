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

@WebServlet({ "/security" })
public class Security extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Security() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        //
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("cookie.getValue() = " + cookie.getValue());
                System.out.println("session.getId() = " + session.getId());
                //if (cookie.getValue().equals(session.getId())) {
                if (cookie.getValue().equals("123456789")) {
                    getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/view/info.jsp")
                            .forward(request, response);
                }
            }
        }
        //
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Session ERROR</h1><br><br><br>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
