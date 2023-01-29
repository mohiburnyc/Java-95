<h2>
<%
 out.println("user name = " + request.getParameter("txt_uid") + "<br>");
 out.println("password = " + request.getParameter("txt_pwd") + "<hr>");
%>

user name = ${param.txt_uid} 
<br>
password = ${param.txt_pwd}
</h2>

<hr>
<h2>
<%
 out.println("user name = " + request.getParameter("txt_uidd") + "<br>");
 out.println("password = " + request.getParameter("txt_pwdd") + "<hr>");
%>

user name = ${param.txt_uidd} 
<br>
password = ${param.txt_pwdd}
</h2>
