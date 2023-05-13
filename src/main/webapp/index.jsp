<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>实验五</title>
    <style>
        *{
            padding: 0;
            margin: 0;
            font-family: "楷体";
        }


        ul{
            float: right;
            list-style-type: none;
            margin: 15px;
        }
        ul li{
            display: inline-block;
        }

        ul li a{
            text-decoration: none;
            color: #fff;
            padding: 5px 20px;
            border: 1px solid transparent;
            transition: .6s ease;
            border-radius: 20px;
        }

        ul li a:hover{
            background-color: #fff;
            color: #000;
        }
        ul li.active a{
            background-color: #fff;
            color: #000;
        }
        .title{
            position: absolute;
            top:50%;
            left:50%;
            transform: translate(-50%,-50%);
        }
        .title h1{
            color: #fff;
            font-size: 70px;
            font-family: Century Gothic;
        }
    </style>
</head>
<body>


<style>
    body{
        background-color: #FFC1C1;
    }
</style>

<header>
    <div class="main">
        <ul>
            <li class="active"><a href="#">首页</a></li>
            <li><a href="http://localhost:8080/studentmanager/ListStudentServlet.do" target="_blank">学生信息列表</a></li>
            <li><a href="http://localhost:8080/studentmanager/excel.jsp" target="_blank">Excel导入</a></li>
            <li><a href="http://localhost:8080/studentmanager/search.jsp" target="_blank">查询学生信息</a></li>
        </ul>
    </div>
    <div class="title">
        <h1><span style="color: crimson;">Our</span> fifth assignment</h1>
    </div>

</header>
</body>
</html>