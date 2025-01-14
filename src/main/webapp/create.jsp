<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="index.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create</title>
</head>
<body>
<main>
    <h1>WELCOME TO CREATE </h1>
    <br/>
    <form action="${pageContext.request.contextPath}/create-servlet" method="post">
        <label>UserName:<input type="text" name="uName" placeholder="UserName"></label><br/>
        <label>ParentName :<input type="text" name="pName" placeholder="ParentName"></label><br/>
        <label>Class :<input type="number" name="uClass" placeholder=Class></label><br/>
        <label>PhoneNumber :<input type="number" name="uPhone" placeholder="PhoneNumber"> </label><br/>
        <label><input type="submit" value=" Create"></label>
    </form>
 </main>
</body>
</html>