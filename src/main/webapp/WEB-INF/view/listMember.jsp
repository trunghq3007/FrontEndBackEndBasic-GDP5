<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>List Member</title>
</head>
<body>
	<div class="container">
		<div align="right">
			<form action="MemberServlet?action=display" method="get"></form>
		</div>

		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">List</div>
				</div>
				<form action="MemberServlet?action=display" method="get">
					<table class="table">
						<thead>
							<tr>
								<th>User</th>
								<th>Password</th>
								<th>Email</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="tempMember" items="${LIST_MEMBER}">
								<c:url var="updateLink" value="MemberServlet">
									<c:param name="memberId" value="${tempMember.id}"></c:param>
									<c:param name="action" value="edit"></c:param>
								</c:url>
								<c:url var="deleteLink" value="MemberServlet">
									<c:param name="memberId" value="${tempMember.id}"></c:param>
									<c:param name="action" value="delete"></c:param>
								</c:url>
								<tr>
									<td>${tempMember.userName}</td>
									<td>${tempMember.password}</td>
									<td>${tempMember.email}</td>
									<td><a href="${updateLink}">Update</a> <a
										href="${deleteLink}"
										onclick="if(!(confirm('ARE YOU SURE TO DELETE THIS MEMBER?'))) return false">Delete
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>

				<div class="form-group">
					<div class="col-md-12 control">
						<button onclick="location.href='MemberServlet?action=logout'"
							id="signup" class="btn btn-success">LogOut</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>