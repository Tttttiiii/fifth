<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>��ѯѧ����Ϣ</title>
</head>
<body>
<center>
  <h1>
    ��ѯѧ����Ϣ
  </h1>
</center>
<table align="center" width="360" border="1" cellspacing="0"
       cellpadding="5">

  <tr>
    <td align="center">
      ѧ��

    </td>
    <td>
      ${student.id}
    </td>
  </tr>

  <tr>
    <td align="center">
      ����

    </td>
    <td>
      ${student.name}
    </td>
  </tr>
  <tr>
    <td align="center">
      �Ա�
    </td>
    <td>
      ${student.sex}
    </td>
  </tr>
  <tr>
    <td align="center">
      �༶
    </td>
    <td>
      ${student.grade}
    </td>
  </tr>

  <tr>
    <td align="center">
      ����

    </td>
    <td>
      ${student.age}
    </td>
  </tr>

  <tr>
    <td align="center">
      �ɼ�
    </td>
    <td>
      ${student.score}
    </td>
  </tr>
</table>

</body>
</html>