<%!
 String companyName = "edureka limited"; //instance variable 

 public int add(int x, int y){
	 return x+y;
 }
%>
 
<h2>
Company Name = <%=companyName %>
<br><br>

<%="10 + 23 = " + add(10,23) %>
</h2>