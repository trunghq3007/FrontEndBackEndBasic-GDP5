<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="css" value="${pageContext.request.contextPath}/assets/css"></c:set>
<c:set var="js" value="${pageContext.request.contextPath}/assets/js"></c:set>
<c:set var="img" value="${pageContext.request.contextPath }/assets/img"></c:set>
<c:set var="bootstrap" value="${pageContext.request.contextPath }/assets/bootstrap"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register page</title>
    <link rel="stylesheet" href="${bootstrap}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css }/admin.css">
    <script src="${js }js/jquery.js"></script>
    <script src="${bootstrap}/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container container-custom">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Đăng KÝ</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="" method="POST">
                           
                            <div class="form-group">
                                <input class="form-control" placeholder="Tên đăng nhập" name="username" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Mật khẩu" name="password" type="password" value="">
                            </div>
                            <button type="submit" class="btn btn-lg btn-success btn-block">Đăng ký</button>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
</body>
</html>