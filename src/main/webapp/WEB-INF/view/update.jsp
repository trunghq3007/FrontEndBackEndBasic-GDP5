<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Update</title>
</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Update</div>
				</div>
				<form action="MemberServlet" method="get" class="form-horizontal">
					<input type="hidden" name="memberId" value="${THE_MEMBER.id}">
					<input type="hidden" name="action" value="update">

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-user"></i></span> <input id="username"
							type="text" class="form-control" name="username"
							value="${THE_MEMBER.userName}">
					</div>

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-lock"></i></span> <input id="password"
							class="form-control" name="password"
							value="${THE_MEMBER.password}">
					</div>

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="	glyphicon glyphicon-envelope"></i></span> <input
							id="login-email" type="email" class="form-control" name="email"
							value="${THE_MEMBER.email}">
					</div>

					<div style="margin-top: 10px" class="form-group">
						<div class="col-md-6 controls">
							<button type="submit" class="btn btn-success">Update</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>