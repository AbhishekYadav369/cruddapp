<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="index.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update</title>
</head>
<body>
<main>
    <h2>WELCOME TO UPDATE</h2>
    <br>
    <form action="${pageContext.request.contextPath}/update-servlet" method="post">
        <label>StudentName:<input type="text"  name="sName" placeholder="UserName"></label><br/>
        <label>ParentName:<input type="text" name="pName" placeholder="ParentName"> </label><br/>
        <label>UpdatedStudentName:<input type="text" name="newName" placeholder="updatedName"></label><br/>
        <label>UpdatedParentName:<input type="text" name="newPName" placeholder="UpdatedParentName"> </label><br/>
        <label>UpdatedClass :<input type="text" name="newClass" placeholder="UpdatedClass"></label><br/>
        <label>NewPhoneNumber :<input type="number" name="newPhoneNo" placeholder="UpdatedPhoneNumber"> </label><br/>
        <label><input type="submit" value=" Update"></label>

    </form>

</main>

</body>
</html>