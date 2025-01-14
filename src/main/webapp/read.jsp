<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="index.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Read</title>
</head>
<body>
<main>
    <h2>WELCOME TO READ </h2>
    <form action="${pageContext.request.contextPath}/read-servlet" method="post">
        <label>Enter StudentName :<input type="text" name="sName" placeholder="StudentName">  </label><br/>
        <label>Enter ParentName :<input type="text"  name="pName" placeholder="ParentName"> </label><br/>
        <label><input type="submit" value="Read Data"></label><br/>
    </form>


</main>

</body>
</html>