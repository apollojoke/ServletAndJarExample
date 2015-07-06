//package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

import service.*;
import service2.*;

public class HelloServlet extends HttpServlet {
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    PrintWriter out = res.getWriter();

    out.println(new Service().service());
    out.println(new Service2().service());
    out.close();
  }
}