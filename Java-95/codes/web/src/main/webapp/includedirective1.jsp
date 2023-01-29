<%@page import="java.util.Date" info="JSP example to understand page directive" language="java" %>
<p style="text-align:center; margin-top:50px;font-size:35px;color:blue;line-height:3">
<%
 Date today = new Date();
 out.println(today);
%>
<br>
<%=getServletInfo() %>
</p>