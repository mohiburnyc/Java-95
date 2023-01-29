<%!
 String companyName = "edureka limited"; //instance variable 

 public int add(int x, int y){
	 return x+y;
 }
%>
 
<h2>
<%
 out.println("Cmpany Name = " + companyName + "<br>");
 out.println("Sum = " + add(12, 33));
%>
</h2>