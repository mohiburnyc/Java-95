<%@page isErrorPage="true" %>
<body style="background-color:gray;color:yellow;font-size:25px;">
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error --> " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Error Message --> " + exception.getMessage());
 else
	 out.println("Internal Server Error!!");
%>
</body>