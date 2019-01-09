<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="css" value="${request.getContextPath() }assets/css"></c:set>
<c:set var="js" value="${request.getContextPath() }assets/js"></c:set>
<c:set var="images" value="${request.getContextPath() }assets/images"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="${css }/bootstrap.css">
<link rel="stylesheet" href="${css }/custom.css">
<title>Login</title>
</head>

<body>
	<div class="login-wrapper">
		<form id="loginForm" action="#">
			<h2>Welcome</h2>
			<div class="input-wrapper">
				<input type="text" name="username" required> <label>Username</label>
			</div>
			<div class="input-wrapper">
				<input type="password" name="password" required> <label>Password</label>
			</div>
			<div class="remember-wrapper">
				<label class="checkbox-inline"><input type="checkbox"
					value="">Remember me</label>
			</div>
			<div class="submit-wrapper">
				<button class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>