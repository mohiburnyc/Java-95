<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<jsp:useBean class="co.edureka.web.Account" id="acc"></jsp:useBean>
	<jsp:setProperty property="*" name="acc"/>
	<h2>
		A/C No:
		<jsp:getProperty name="acc" property="accountNo" />
		<br> A/C Name:
		<jsp:getProperty name="acc" property="accountName" />
		<br> A/C Balance:
		<jsp:getProperty name="acc" property="accountBalance" />
	</h2>	
</body>
</html>