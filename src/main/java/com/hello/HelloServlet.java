package com.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "helloservlet",
        urlPatterns = "/",
        description = "Hello world"
)

public class HelloServlet extends HttpServlet {

    public static final String START_HTML_FILE="<html><body>";
    public static final String END_HTML_FILE="</body></html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(START_HTML_FILE + "<h1>Hello World!</h1>" + END_HTML_FILE);
    }

}
