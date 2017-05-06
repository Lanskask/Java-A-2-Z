<%@ page import="ru.smurtazin.servlets.UserStorage" %>
<%@ page import="ru.smurtazin.servlets.User" %><%--
  Created by IntelliJ IDEA.
  User: a1
  Date: 06.05.17
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index JSP</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/echo" method="post">
    Login: <input type="text" name="login"> <br>
    E-mail: <input type="text" name="email">
    <input type="submit">
</form>

<table style="border: 1px solid black;" cellpadding="1" cellspacing="1" border="1">
    <tr>
        <th>Login</th>
        <th>EMail</th>
    </tr>
    <% for (User user : UserStorage.getInstance().getUsers()) { %>
    <tr>
        <td><%=user.getLogin()%>
        </td>
        <td><%=user.getEmail()%>
        </td>
    </tr>
    <% } %>
</table>

</body>
</html>
