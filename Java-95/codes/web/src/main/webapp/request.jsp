<%!
 String uname;
 String pass;
%>

<h2>
<%
 uname = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 out.println("user name = "+ uname);
%> 
<br>
password = <%=pass %>
<hr>

server name = <%=request.getServerName() %> <br>
server port = <%=request.getServerPort() %> <br>
method = <%=request.getMethod() %> <br>
protocol = <%=request.getProtocol() %> <br>
application name = <%=request.getContextPath() %> <br>