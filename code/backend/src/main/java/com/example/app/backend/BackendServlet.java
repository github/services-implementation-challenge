package com.example.app.backend;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BackendServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BackendServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String arg = request.getParameter("arg");
        int length = arg == null ? 0 : arg.length();
        try (PrintWriter out = response.getWriter()) {
            out.println("Length of argument: " + length);
        }
    }
}
