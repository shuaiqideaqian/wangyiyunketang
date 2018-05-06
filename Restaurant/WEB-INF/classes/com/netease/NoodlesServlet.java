package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoodlesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		String vegetable = req.getParameter("vegetable");
		
		if (vegetable == null) {
			vegetable = "Tomato";
		}
		
		writer.println("<html><body>");
		writer.println("<h1> Noodels with " + vegetable + "</h1>");
		writer.println("</body></html>");
	}
}