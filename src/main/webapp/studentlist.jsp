<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>学生信息列表</title>

	</head>

	<body>
	<center>
			<table align="center" width="360" border="0">
			<tr>
				<td align="center">
					<h1>学生信息列表</h1>
				</td>

			</tr>
		</table>
		<table align="center"  width="660" border="1" cellspacing="0" cellpadding="5" bordercolor="#000">
			<tr>
				<th width="50px">   学号</th>
				<th width="100px">	姓名 </th>
				<th width="100px">	性别 </th>
				<th width="50px">	年龄	</th>
				<th width="150px">	班级	</th>
				<th width="50px">	成绩	</th>
				<th width="150px">   图片</th>
				<th width="50px">	修改	</th>
				<th width="50px">	删除	</th>
				<th width="50px">   新增</th>
			</tr>
			<c:forEach var="studentitem" items="${studentlist}">
				<tr>
					<td >
							${studentitem.getId()}
					</td>
					<td >
							${studentitem.getName()}
					</td>
					<td >
							${studentitem.getSex()}
					</td>
					<td >
							${studentitem.getAge()}
					</td>
					<td >
							${studentitem.getGrade()}
					</td>
					<td >
							${studentitem.getScore()}
					</td>
					<td >
						<img width="90px" height="90px" src="${studentitem.getImage()}">
					</td>
					<td >
						<a href="updateServlet.do?id=${studentitem.id}">修改</a>
					</td>
					<td >
						<a href="showStudent.do?id=${studentitem.id}">删除</a>
					</td>
					<td>
						<a href="studentinsert.jsp">新增</a>
					</td>

				</tr>
			</c:forEach>
		</table>
	</center>
	</body>
</html>

