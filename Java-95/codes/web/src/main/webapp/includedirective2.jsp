<%@page errorPage="handler.jsp" %>
<%!
 int x = 10;
 int y = 5;
 //int y = 0;
 int[] marks = new int[7];
%>
<h2>
<%
 int z = x/y;
 out.println(x + " / " + y + " = " + z + "<br>");
 //out.println(marks[0]);
 out.println(marks[7]);
%>
</h2>