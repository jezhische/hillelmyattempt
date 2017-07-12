<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hillel Spring MVC XML Configuration Example</title>
</head>
<body>

    <spring:form modelAttribute="userFromServer" method="post" action="/jezh/users/check">
        <spring:input path="name"/>
        <spring:input path="password"/>
        <spring:button>check user</spring:button>
    </spring:form>

</body>
</html>