<%!
 String uname;
 String pass;
%>

<h2>
<%
 uname = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 if(uname.equals("admin") && pass.equals("123"))
	 response.sendRedirect("https://www.edureka.co");
 else
	 response.sendError(response.SC_UNAUTHORIZED, "Authentication Failed!!");
%> 