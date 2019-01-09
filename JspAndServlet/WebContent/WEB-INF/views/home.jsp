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
<title>Home</title>
</head>
<body>
	<header>
		<nav>
			<div class="container-fluid nav-wrapper">
				<div class="row">
					<div class="col-md-6">
						<img class="logo" src="${images }/logo-lisaho.png" alt="logo-page">
						<img class="logo" src="${images }/logo-southbank.png" alt="logo-page">
					</div>
					<div class="col-md-5 phone-contact">
						<b class="phone-contact-content">HOTLINE: 0963.9999.30 -
							0909.343.048</b>
					</div>
					<div class="col-md-1 phone-contact">
						<a class="phone-contact-content" href="#"><u>Login</u></a>
					</div>
				</div>
			</div>
		</nav>
		<div class="banner">
			<div class="banner-wrapper container">
				<div class="slide-banner">
					<img src="${images }/slide.jpg" alt="slide-banner">
				</div>
				<form class="register-form" action="home" name="registForm"
					method="post">
					<h6>HỌC VIỆN CÔNG NGHỆ SOUTHBANK, ÚC</h6>
					<p class="sub-title-form">Bạn còn thắc mắc về du học Úc? Vui
						lòng để lại thông tin dưới đây, chúng tôi sẽ liên hệ tư vấn nhanh
						nhất</p>
					<input class="form-control" type="text" name="fullName"
						placeholder="Họ và tên"> <input class="form-control"
						type="number" name="phone" placeholder="Điện thoại"> <select
						class="form-control" name="address">
						<option value="0">Nơi ở ...</option>
						<option value="1">Hà Nội</option>
						<option value="2">Đà Nẵng</option>
						<option value="3">TP.HCM</option>
					</select> <select class="form-control" name="graduation">
						<option value="0">Bạn đã tốt nghiệp?</option>
						<option value="1">Chưa tốt nghiệp</option>
						<option value="2">Đã tốt nghiệp</option>
					</select> <select class="form-control" name="major">
						<option value="0">Ngành đăng kí</option>
						<option value="1">Quản trị kinh doanh</option>
						<option value="2">Công nghệ thông tin</option>
						<option value="3">Lịch sử đảng</option>
					</select> <input class="form-control" type="text" placeholder="Email"
						name="email">
					<button id="submitButton" class="btn btn-default">Đăng
						kí</button>
				</form>
			</div>
		</div>
	</header>
	<div class="content-wrapper">
		<section class="section1">
			<p class="title">CÁC BƯỚC ĐỂ DU HỌC THÀNH CÔNG</p>
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<img src="${images }/add-1.jpg" alt="step1-image">
					<p class="sub-title">BƯỚC 1: ĐĂNG KÍ</p>
					<p>Đăng kí để lại thông tin của bạn</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<img src="${images }/add-2.jpg" alt="step1-image">
					<p class="sub-title">BƯỚC 2:ĐƯỢC TƯ VẤN TỪ BỘ PHẬN TUYỂN SINH</p>
					<p>Chuyên gia tư vấn của chúng tôi sẽ giúp bạn chọn ngành học
						phù hợp</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<img src="${images }/add-3.jpg" alt="step1-image">
					<p class="sub-title">BƯỚC 3: HOÀN THÀNH HỒ SƠ</p>
					<p>Chuyên gia tư vấn sẽ hỗ trợ bạn hoàn thành hồ sơ nhập học và
						visa chu đáo</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<img src="${images }/add-4.jpg" alt="step1-image">
					<p class="sub-title">BƯỚC 4: TRẢI NGHIỆM HỌC TẬP QUỐC TẾ</p>
					<p>Bắt đầu học tập tại môi trường giáo dục hàng đầu thế giới</p>
				</div>
			</div>
			<button class="section1-submit btn btn-default">Đăng ký</button>
		</section>
		<section class="section2">
			<p class="title">LỢI ÍCH KHI THAM GIA HỌC TẬP TẠI HỌC VIỆN
				SOUTHBANK</p>
			<div class="row">
				<div class="col-lg-2 col-md-4">
					<img src="${images }/benefit-1.jpg" alt="#">
					<p>Không cần thi đầu vào</p>
				</div>
				<div class="col-lg-2 col-md-4">
					<img src="${images }/benefit-2.jpg" alt="#">
					<p>Không cần chứng minh tài chính</p>
				</div>
				<div class="col-lg-2 col-md-4">
					<img src="${images }/benefit-3.jpg" alt="#">
					<p>Học phí và phí sinh hoạt cạnh tranh</p>
				</div>
				<div class="col-lg-2 col-md-4">
					<img src="${images }/benefit-4.jpg" alt="#">
					<p>Đội ngũ giáo viên là chuyên gia trong các lĩnh vực chuyên
						môn, giàu kinh nghiệm trong việc giảng dạy học sinh quốc tế</p>
				</div>
				<div class="col-lg-2 col-md-4">
					<img src="${images }/benefit-5.jpg" alt="#">
					<p>250 chương trình chuyển tiếp vào các trường Đại học hàng đầu
						của Úc sẽ giúp sinh viên hoàn thành con đường học vấn đỉnh cao</p>
				</div>
				<div class="col-lg-2 col-md-4">
					<img src="${images }/benefit-6.jpg" alt="#">
					<p>Sau khi tốt nghiệp học sinh được phép ở lại thêm 2 năm làm
						việc ở Úc</p>
				</div>
			</div>
		</section>
		<section class="section3">
			<p class="title">LỢI ÍCH KHI LÀM HỒ SƠ DU HỌC TẠI CÔNG TY LISAHO</p>
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<img src="${images }/benefit-2-1.png" alt="step1-image">
					<p class="sub-title">VỀ CHÚNG TÔI</p>
					<p>Công ty tư vấn du học LisaHo do ông Kelvin Chu - người Úc,
						có nhiều kinh nghiệm trong lĩnh vực đào tạo và giáo dục nghề tại
						Úc thành lập. Là đại diện tuyển sinh chính thức của Học viện công
						nghệ SOUTHBANK</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<img src="${images }/benefit-2-2.png" alt="step1-image">
					<p class="sub-title">GIÁ TRỊ "3C"</p>
					<p>
						Học sinh nhận được sự tư vấn hoàn thiện:<br> - Củng cố nền
						tảng<br> - Chọn trường phù hợp<br> - Cơ hội nghề nghiệp
					</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<img src="${images }/benefit-2-3.png" alt="step1-image">
					<p class="sub-title">MIỄN PHÍ TƯ VẤN 100%</p>
					<p>Chuyên gia tư vấn sẽ hỗ trợ bạn hoàn thành hồ sơ nhập học và
						visa chu đáo</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<img src="${images }/benefit-2-4.png" alt="step1-image">
					<p class="sub-title">QUÀ TẶNG GIÁ TRỊ</p>
					<p>Bắt đầu học tập tại môi trường giáo dục hàng đầu thế giới</p>
				</div>
			</div>
		</section>
		<section class="section4">
			<p class="title">NGÀNH ĐÀO TẠO & ĐỐI TƯỢNG TUYỂN SINH</p>
			<div class="row">
				<div class="col-lg-6">
					<img src="${images }/object-left.png" alt="step1-image">
				</div>
				<div class="col-lg-6">
					<img src="${images }/object-right.png" alt="step1-image">
				</div>
			</div>
		</section>
	</div>
	<footer>
		<p>KHAI GIẢNG: THÁNG 07/2014 VÀ THÁNG 01/2015</p>
		<img src="${images }/go-to-top.png" alt="">
	</footer>
	<script src="${js }/jquery-3.3.1.min.js"></script>
	<script src="${js }/custom.js"></script>
</body>
</html>