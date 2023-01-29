package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/form4")
public class Form4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.println("<body bgcolor=pink>");	
		out.println("<h2>" + session.getId() + " - " + session.isNew() + "</h2>");
		
		out.println("<h2>");
		
		Enumeration<String> attributes = session.getAttributeNames();
		while(attributes.hasMoreElements()) {
			String aname = attributes.nextElement();
			String avalue = session.getAttribute(aname).toString();
			out.println(aname + " - " + avalue + "<br>");
		}
		/*
		Cookie[] cookies = request.getCookies();
		for(Cookie ck : cookies) {
			String cname = ck.getName();
			String cvalue = ck.getValue();
			out.println(cname + " = " + cvalue + "<br>");
		}
		*/
		
		out.println("salary = " + request.getParameter("t6"));
		out.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
