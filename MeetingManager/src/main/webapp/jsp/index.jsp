<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/10/5
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" width="400px">
    <tr align="center">
        <td>预定编号</td>
        <td>会议室名称</td>
        <td>预定人</td>
        <td>预定日期</td>
    </tr>
    <c:forEach items="${meeting}" var="item">
    <tr align="center">
        <td>${item.id}</td>
        <td>${item.meetingName}</td>
        <td>${item.advanceName}</td>
        <td>
            <fmt:formatDate value="${item.meetingOrder}" pattern="yyyy-MM-dd" ></fmt:formatDate>
        </td>
    </tr>
    </c:forEach>
</table>
<a href="/jsp/add.jsp">预定会议室</a>
</body>
</html>
