<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Risultato</title>
</head>
<body>
	<h4>Numero parole: </h4> <b>${contatore}</b>
	<h4>Numero palindrome: </h4> <b>${contaPalindrome}</b><br>
		<c:forEach items="${parolePalindrome}" var="lista"> 
			<c:out value="${lista}" />
		</c:forEach> 
	<form action="index.jsp">
		<input type="submit" value="Torna alla home">
	</form>
	
</body>
</html>