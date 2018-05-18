<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GlobalRoot
  Date: 18.05.2018
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<sf:form action="/" modelAttribute="user" method="post">

    <sf:input type="text" name="name" path="name"/>
    <sf:input type="text" name="age" path="age"/>
    <input type="submit">

</sf:form>

<c:forEach items="${users}" var="user">
    <ul>
        <li>Name is: ${user.name}
            Age is ${user.age}
            <button value="delete" id="delete_user">delete</button>
        </li>
    </ul>
</c:forEach>

</body>
</html>
