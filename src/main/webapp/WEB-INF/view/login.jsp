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
<title>Login</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">
					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>
					<form class="form-horizontal" method="post"
						action="${pageContext.request.contextPath}/MemberServlet?action=login">
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input type="text"
								class="form-control" name="username" placeholder="username">
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input type="password"
								class="form-control" name="password" placeholder="password">
						</div>


						<div style="margin-top: 10px" class="form-group">
							<div class="col-md-6 controls">
								<input type="submit" value="Login" class="btn btn-success">
							</div>
						</div>
					</form>

					<button onclick="location.href='signup.jsp'" id="signup"
						class="btn btn-success">Sign Up Here</button>
				</div>
			</div>
		</div>
	</div>
	
		<script>
		$(function() {

			$('#login-form-link').click(function(e) {
				$("#login-form").delay(100).fadeIn(100);
				$("#register-form").fadeOut(100);
				$('#register-form-link').removeClass('active');
				$(this).addClass('active');
				e.preventDefault();
			});
			$('#register-form-link').click(function(e) {
				$("#register-form").delay(100).fadeIn(100);
				$("#login-form").fadeOut(100);
				$('#login-form-link').removeClass('active');
				$(this).addClass('active');
				e.preventDefault();
			});

		});
		
		$(document).ready(function() {
			//Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
			$("#login-form").validate({
				rules: {
					username: "required",
					password: "required",
				},
				messages: {
					username: "Vui lòng nhập tên đăng nhập",
					password: "Vui lòng nhập mật khẩu",	
				}
			});
		});
		
		$(document).ready(function() {
			var iUserName = $("#username1");
			var iPassword = $("#password1");
			var iRePassword = $("#confirm-password");
			$('#register-submit').click(function() {
								if (iUserName.val() == "") {
									$("#note").html("Bạn chưa nhập tên tài khoản");
									$("#username1").focus();
									return false;
								} else if (iPassword.val() == "") {
									$("#note").html("Bạn chưa nhập mật khẩu");
									$("#password1").focus();
									return false;
								} else if (iPassword.val() != iRePassword.val()) {
									$("#note").html("Mật khẩu không trùng");
									return false;
								}
								else {
									return true;
								}
							});
		});
	</script>
</body>
</html>