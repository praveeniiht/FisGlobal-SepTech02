<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 Welcome to the application....
 Below are the list of users

<table border=1>
				<tr>
					<td>User Name </td>
					<td>Password </td>
				</tr>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.username}</td>
                        <td>${user.password } </td>
                    </tr>
                </c:forEach>

 </table>
</body>
</html>