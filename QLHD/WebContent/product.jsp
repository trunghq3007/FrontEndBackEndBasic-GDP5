
<%@page import="com.entity.Contact"%>
<%@page import="bll.ContactBLL"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
	<%
		ContactBLL contactBLL = new ContactBLL();
	%>
	<thead>
	<th>Tên họ</th>
	<th>Số ĐT</th>
	<th>Địa Chỉ</th>
	<th>Ngành</th>
	<th>Chuyên Ngành</th>
	<th>Email</th><br>
	</thead>
	<%
		for (Contact u : contactBLL.getAll()) {
	%>
	<tbody>
	<td><%=u.getName()%></td>
	<td><%=u.getPhone()%></td>
	<td><%=u.getAddress()%></td>
	<td><%=u.getGraduate()%></td>
	<td><%=u.getMajor()%></td>
	<td><%=u.getEmail()%></td><br>
	</tbody>
	<%
		}
	%>
</body>
</html>