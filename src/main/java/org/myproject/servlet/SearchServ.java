package org.myproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServ extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // Set response content type
        response.setContentType("text/html");

        String payload;
        String query = request.getParameter("q");
        if (query == null || query.trim().length() == 0) {
            // create no results json
            payload = "No results";
        } else {
            // return full data set
            payload = "Full data set";
        }

        PrintWriter out = response.getWriter();
        out.println(payload);
    }

    public void destroy() {
        // do nothing.
    }
}
