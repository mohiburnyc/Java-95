<jsp:useBean class="co.edureka.web.Account" id="acc"></jsp:useBean>

<h2>
A/C No: <jsp:getProperty name="acc" property="accountNo"/> <br>
A/C Name: <jsp:getProperty name="acc" property="accountName"/> <br>
A/C Balance: <jsp:getProperty name="acc" property="accountBalance"/> <br>

<hr>
<jsp:setProperty name="acc" property="accountName" value="Sunil Joseph"/>
A/C Name: <jsp:getProperty name="acc" property="accountName"/>
</h2>