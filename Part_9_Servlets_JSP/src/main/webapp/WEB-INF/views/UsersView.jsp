<%@ page import="ru.smurtazin.servlets.UserStorage" %>
<%@ page import="ru.smurtazin.servlets.User" %>
<%@ page import="java.util.List" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: a1
  Date: 08.04.17
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<style>
		#loginUsersResults {
			border: 1px solid black;
		}

		#loginUsersResults > table {
			/*border-spacing: 2px;*/
		}

		#loginUsersResults > td {
			/*padding: 1px;*/
			/*border-collapse: collapse;*/
		}

		#loginUsersResults > table td, table tr {
			border: 1px solid black;
		}
	</style>
	<title>JSP Secundo</title>
</head>
<body>

<%--<form action="<%=request.getContextPath()%>/" method="post">--%>
<p>2</p>
<form action="${pageContext.servletContext.contextPath}/" method="post">
	<table>
		<tr>
			<td>Login:</td>
			<td><input type="text" name="login"></td>
		</tr>
		<tr>
			<td>E-mail:</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>
				<input type="submit">
			</td>
		</tr>
	</table>
</form>

<table id="loginUsersResults">
	<tr>
		<th>Login</th>
		<th>EMail</th>
	</tr>
	<%--<% for (User user : UserStorage.getInstance().getUsers()) { %>--%>
	<%--<% for (User user : (List<User>) request.getAttribute("users")) { %>--%>
	<c:forEach items="${users}" var="user">
	<tr>
		<td>
			<c:out value="${user.login}"/>
		</td>
		<td>
			<c:out value="${user.email}"/>
		</td>
	</tr>
	</c:forEach>
	<%--<% } %>--%>
</table>

</body>
</html>
