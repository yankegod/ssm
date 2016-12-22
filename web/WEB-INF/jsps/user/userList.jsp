<%--
  Created by IntelliJ IDEA.
  User: yanke
  Date: 2016/12/22
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户查询</title>
</head>
<body>
<table>
<c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.birthday}</td>

        </tr>
</c:forEach>
</table>

</form>

</body>
</html>
