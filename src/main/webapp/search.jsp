<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/5/12
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询学生信息</title>
</head>
<body>
<center>
    <h1>查询学生信息</h1>
    <form action="SearchStudent.do" method="post">

        <p>学号: <input type="text" name="id" /></p>
        <input type="submit" value="查询" />
    </form>
</center>

</body>
</html>
