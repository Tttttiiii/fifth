<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>ѧ����Ϣ�б�</title>

	</head>

	<body>
	<center>
			<table align="center" width="360" border="0">
			<tr>
				<td align="center">
					<h1>ѧ����Ϣ�б�</h1>
				</td>

			</tr>
		</table>
		<table align="center"  width="660" border="1" cellspacing="0" cellpadding="5" bordercolor="#000">
			<tr>
				<th width="50px">   ѧ��</th>
				<th width="100px">	���� </th>
				<th width="100px">	�Ա� </th>
				<th width="50px">	����	</th>
				<th width="150px">	�༶	</th>
				<th width="50px">	�ɼ�	</th>
				<th width="150px">   ͼƬ</th>
				<th width="50px">	�޸�	</th>
				<th width="50px">	ɾ��	</th>
				<th width="50px">   ����</th>
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
						<a href="updateServlet.do?id=${studentitem.id}">�޸�</a>
					</td>
					<td >
						<a href="showStudent.do?id=${studentitem.id}">ɾ��</a>
					</td>
					<td>
						<a href="studentinsert.jsp">����</a>
					</td>

				</tr>
			</c:forEach>
		</table>
	</center>
	</body>
</html>

