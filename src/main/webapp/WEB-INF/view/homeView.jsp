<%@page import="util.MyUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/css.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.image-slide {
	margin-left: -20px;
	width: 1200px;
	height: 600px;
	background-image: url("image/slide.jpg");
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
<meta charset="UTF-8">
<title>Lishaho</title>
</head>

<body>

	<div class="header">
		<div class="row">
			<div class="col-sm-6 logo-header">
				<img src="image/logo-lisaho.png" style="height: 51px;"> <img
					src="image/logo-southbank.png">
			</div>
			<div class="col-sm-6 contact-phone">
				<b>HOTLINE: 0963.9999.30 - 0909.343.048</b>
				<%
					if (session.getAttribute("loginedUser")==null){
				%>
				 <a	href="${pageContext.request.contextPath}/login" class="icol" style="float: right; margin-right: 20%; color: yellowgreen">
					<b class="glyphicon glyphicon-log-in" style="font-size: 20px">Login</b>
				</a>
				<%
					}else{
				%>
					<div style="float: right; margin-right: 40%; color: yellowgreen;font-size: 20px">
						 <% out.print("<b>xin chào "+session.getAttribute("userN")+" </b>"); %>
					</div>
						<div style="float: right; margin-right: 20%; color: yellowgreen;font-size: 20px">
						 <a	href="${pageContext.request.contextPath}/logout" class="icol" style="color: yellowgreen">
						<b class="glyphicon glyphicon-log-out" style="font-size: 20px">Logout</b>
					</a>
					</div>
				<%
					}
				%>
			</div>
		</div>
	</div>
	<!-- ./header -->

	<div class="slide">
		<div class="container">
			<div class="image-slide">
				<div class="frm-regis">
					<form class="form-horizontal" id="frm-slide" method="POST"
						role="form">
						<h3 style="font-weight: bold; color: #c48b22;">HỌC VIỆN CÔNG
							NGHỆ SOUTHBANK, ÚC</h3>
						<h5 style="color: #808080d6">Bạn có thắc mắc gì về du học Úc?
							Vui lòng để lại thông tin dưới đây, chúng tôi sẽ liên hệ tư vấn
							nhanh nhất.</h5>
						<div class="form-group">
							<input type="text" id="iHoten" name="hoten"
								placeholder="Họ và tên" class="form-control" autofocus>
						</div>
						<div class="form-group">
							<input type="text" id="iPhone" name="dienthoai"
								placeholder="Điện thoại" class="form-control" autofocus>
						</div>
						<div class="form-group">
							<select class="form-control" name="noio" id="iNoio">
								<option value="" disabled="disabled" selected="selected">Nơi
									ở...</option>
								<option value="HA NOI">Hà Nội</option>
								<option value="TP HCM">TP Hồ Chí Minh</option>
								<option value="DBSCL">ĐBSCL</option>
								<option value="AN GIANG">An Giang</option>
								<option value="BA RIA">Bà Rịa</option>
								<option value="BAC CAN">Bắc cạn</option>
								<option value="BAC GIANG">Bắc Giang</option>
								<option value="BAC LIEU">Bạc Liêu</option>
								<option value="BAC NINH">Bắc Ninh</option>
								<option value="BEN TRE">Bến Tre</option>
								<option value="BIEN HOA">Biên Hòa</option>
								<option value="BINH DINH">Bình Định</option>
								<option value="BINH DUONG">Bình Dương</option>
								<option value="BINH PHUOC">Bình Phước</option>
								<option value="BINH THUAN">Bình Thuận</option>
								<option value="CA MAU">Cà Mau</option>
								<option value="CAN THO">Cần Thơ</option>
								<option value="CAO BANG">Cao Bằng</option>
								<option value="DA NANG">Đà Nẵng</option>
								<option value="DAC LAC">Đắc Lắc</option>
								<option value="DIEN BIEN">Điện Biên</option>
								<option value="DONG NAI">Đồng Nai</option>
								<option value="DONG THAP">Đồng Tháp</option>
								<option value="GIA LAI">Gia Lai</option>
								<option value="HA GIANG">Hà Giang</option>
								<option value="HA NAM">Hà Nam</option>
								<option value="HA TAY">Hà Tây</option>
								<option value="HA TINH">Hà Tĩnh</option>
								<option value="HAI DUONG">Hải Dương</option>
								<option value="HAI PHONG">Hải Phòng</option>
								<option value="HOA BINH">Hòa Bình</option>
								<option value="HUNG YEN">Hưng Yên</option>
								<option value="KHANH HOA">Khánh Hòa</option>
								<option value="KON TUM">Kon Tum</option>
								<option value="LAI CHAU">Lai Châu</option>
								<option value="LAM DONG">Lâm Đồng</option>
								<option value="LANG SON">Lạng Sơn</option>
								<option value="LAO CAI">Lào Cai</option>
								<option value="LONG AN">Long An</option>
								<option value="NAM DINH">Nam Định</option>
								<option value="NGHE AN">Nghệ An</option>
								<option value="NINH BINH">Ninh Bình</option>
								<option value="NINH THUAN">Ninh Thuận</option>
								<option value="PHU THO">Phú Thọ</option>
								<option value="PHU YEN">Phú Yên</option>
								<option value="QUANG BINH">Quảng Bình</option>
								<option value="QUANG NAM">Quảng Nam</option>
								<option value="QUANG NGAI">Quảng Ngãi</option>
								<option value="QUANG NINH">Quảng Ninh</option>
								<option value="QUANG TRI">Quảng Trị</option>
								<option value="SOC TRANG">Sóc Trăng</option>
								<option value="SON LA">Sơn La</option>
								<option value="TAY NINH">Tây Ninh</option>
								<option value="THAI BINH">Thái Bình</option>
								<option value="THAI NGUYEN">Thái Nguyên</option>
								<option value="THANH HOA">Thanh Hóa</option>
								<option value="THUA THIEN HUE">Thừa Thiên-Huế</option>
								<option value="TIEN GIANG">Tiền Giang</option>
								<option value="TRA VINH">Trà Vinh</option>
								<option value="TUYEN QUANG">Tuyên Quang</option>
								<option value="KIEN GIANG">Kiên Giang</option>
								<option value="VINH LONG">Vĩnh Long</option>
								<option value="VINH PHUC">Vĩnh Phúc</option>
								<option value="VUNG TAU">Vũng Tàu</option>
								<option value="YEN BAI">Yên Bái</option>

							</select>
						</div>
						<div class="form-group">
							<select class="form-control" name="totnghiep" id="iTotNghiep">
								<option value="" disabled="disabled" selected="selected">Bạn
									đã tốt nghiệp ?</option>
								<option value="THPT">Trung Học Phổ Thông</option>
								<option value="Trung cap">Trung Cấp</option>
								<option value="Cao Dang">Cao Đẳng</option>
								<option value="Dai hoc">Đại Học</option>
								<option value="Khac">Khác</option>

							</select>
						</div>
						<div class="form-group">
							<select class="form-control" name="nganhhoc" id="iNganhHoc">
								<option value="" disabled="disabled" selected="selected">Ngành
									Đăng Ký</option>
								<option value="Kinh Doanh">Kinh Doanh</option>
								<option value="Ke toan">Kế toán</option>
								<option value="Cong nghe thong tin">Công nghệ thông tin</option>
								<option value="Marketing">Marketing</option>
								<option value="Dieu duong">Điều dưỡng</option>
								<option value="Du lich, khach san">Du lịch, khách sạn</option>
								<option value="Thiet ke do hoa, noi that">Thiết kế đồ
									họa, nội thất</option>
								<option value="Xay dung, kien truc">Xây dựng, kiến trúc</option>
								<option value="Khac">Khác</option>
							</select>
						</div>
						<div class="form-group">
							<input type="email" id="iEmail" placeholder="Email"
								class="form-control" name="email">
						</div>
						<button type="submit" id="submit-slide" class="btn">
							<b style="color: white">Đăng ký</b>
						</button>
						<br> <b class="error" id="note"></b>
					</form>
					<!-- /form -->
				</div>
			</div>
		</div>
	</div>

	<!-- session1 -->
	<div class="container text-center">
		<h3 style="color: #8fb934">
			<B>CÁC BƯỚC ĐỂ DU HỌC THÀNH CÔNG</B>
		</h3>
		<br>
		<div class="row">
			<div class="col-sm-3 step">
				<div class="ico">
					<img src="image/step-1.png" class="img-responsive" alt="icon">
				</div>
				<h4>
					<b>BƯỚC 1: ĐĂNG KÝ</b>
				</h4>
				<br>
				<h5>Đăng ký để lại thông tin của bạn</h5>
			</div>
			<div class="col-sm-3 step">
				<div class="ico">
					<img src="image/step-2.png" class="img-responsive" alt="icon">
				</div>
				<h4>BƯỚC 2: ĐƯỢC TƯ VẤN TỪ BỘ PHẬN TUYỂN SINH</h4>
				<br>
				<h5>Chuyên gia tư vấn của chúng tôi sẽ giúp bạn chọn nghành học
					phù hợp</h5>
			</div>
			<div class="col-sm-3 step">
				<div class="ico">
					<img src="image/step-3.png" class="img-responsive" alt="icon">
				</div>
				<h4>BƯỚC 3: HOÀN THÀNH HỒ SƠ</h4>
				<br>
				<h5>Chuyên gia tư vấn sẽ hỗ trợ bạn hoàn thành hồ sơ nhập học
					và visa chu đáo</h5>
			</div>
			<div class="col-sm-3 step">
				<div class="ico">
					<img src="image/step-4.png" class="img-responsive" alt="icon">
				</div>
				<h4>BƯỚC 4: TRẢI NGHIỆM HOẠT ĐỘNG QUỐC TẾ</h4>
				<br>
				<h5>Bắt đầu học tập tại môi trường hàng đầu thế giới</h5>
			</div>
		</div>
		<button type="submit" class="btn"
			style="color: white; width: 150px; background-color: #8fb934; margin-top: 10px">
			<b>Đăng ký</b>
		</button>
	</div>
	<br>

	<!-- session2 -->
	<div class="session2">
		<div class="container text-center">
			<h3 style="color: #8fb934">
				<B>LỢI ÍCH KHI THAM GIA HỌC TẬP TẠI HỌC VIỆN SOUTHBANK</B>
			</h3>
			<br>
			<div class="row">
				<div class="col-sm-2 ">
					<img src="image/benefit-1.jpg" class="img-responsive" width="100%"
						alt="Image">
					<h5>Không cần thi đầu vào</h5>
				</div>
				<div class="col-sm-2 ">
					<img src="image/benefit-2.jpg" class="img-responsive" width="100%"
						alt="Image">
					<h5>Không cần chứng minh tài chính</h5>
				</div>
				<div class="col-sm-2 ">
					<img src="image/benefit-3.jpg" class="img-responsive" width="100%"
						alt="Image">
					<h5>Học phí và phí sinh hoạt cạnh tranh</h5>
				</div>
				<div class="col-sm-2 ">
					<img src="image/benefit-4.jpg" class="img-responsive" width="100%"
						alt="Image">
					<h5>Đội ngũ giáo viên là những chuyên gia trong các lĩnh vực
						chuyên môn, giàu kinh nghiệm trong việc giảng dạy học sinh quốc tế</h5>
				</div>
				<div class="col-sm-2 ">
					<img src="image/benefit-5.jpg" class="img-responsive" width="100%"
						alt="Image">
					<h5>250 chương trình chuyển tiếp vào các trường Đại học hàng
						đầu của Úc sẽ giúp sinh viên hoàn thành con đường học vấn đỉnh cao</h5>
				</div>
				<div class="col-sm-2 ">
					<img src="image/benefit-6.jpg" class="img-responsive" width="100%"
						alt="Image">
					<h5>Sau khi tốt nghiệp, học sinh được phép ở lại làm việc thêm
						2 năm tại Úc</h5>
				</div>
			</div>
		</div>
		<br>
	</div>

	<!-- session3 -->
	<div class="session3">
		<div class="container text-center"
			style="background-image: url('image/benefit-2-bg.jpg'); height: 450px; background-size: cover;">
			<h3 style="color: white">
				<B>LỢI ÍCH KHI LÀM HỒ SƠ DU HỌC TẠI CÔNG TY LISHAHO</B>
			</h3>
			<br>
			<div class="row">
				<div class="col-sm-3 ">
					<img src="image/benefit-2-1.png" class="img-responsive" width="60%"
						alt="Image"> <font face="Arial, Helvetica, sans-serif"
						style="color: #FFF; font-size: 20px;"><b>VỀ CHÚNG TÔI</b></font>
					<p
						style="font-size: 17px; margin-top: 10px; color: #000; text-align: left;">Công
						ty tư vân du học LisaHo do ông Kelvin Chu - người Úc, có nhiều năm
						kinh nghiệm trong lĩnh vực giáo dục và đào tạo nghề tại Úc thành
						lập. Là đại diện tuyển sinh chính thức của Học viện công nghệ
						Southbank</p>
				</div>
				<div class="col-sm-3 ">
					<img src="image/benefit-2-2.png" class="img-responsive" width="60%"
						alt="Image"> <font face="Arial, Helvetica, sans-serif"
						style="color: #FFF; font-size: 20px;"><b>Giá trị <font
							style="font-size: 22px;">"3C"</font></b></font>
					<p
						style="font-size: 17px; margin-top: 10px; color: #000; text-align: left;">
						Học sinh nhận được sự tư vấn hoàn thiện:<br />- Củng cố nền tảng<br />-
						Chọn trường phù hợp<br />- Cơ hội nghề nghiệp
					</p>
				</div>
				<div class="col-sm-3 ">
					<img src="image/benefit-2-3.png" class="img-responsive" width="60%"
						alt="Image"> <font face="Arial, Helvetica, sans-serif"
						style="color: #FFF; font-size: 20px;"><b>MIỄN PHÍ TƯ
							VẤN 100%</b></font>
					<p
						style="font-size: 17px; margin-top: 10px; color: #000; text-align: left;">Tất
						cả các chuyên gia tư vấn luôn sát cánh bên bạn, giúp bạn lựa chọn
						đúng đắn để đạt mục tiêu và ước mơ du học</p>
				</div>
				<div class="col-sm-3 ">
					<img src="image/benefit-2-4.png" class="img-responsive" width="60%"
						alt="Image"> <font face="Arial, Helvetica, sans-serif"
						style="color: #FFF; font-size: 20px;"><b>QUÀ TẶNG GIÁ
							TRỊ</b></font>
					<p
						style="font-size: 17px; margin-top: 10px; color: #000; text-align: left;">
						<b>1.</b> Voucher $200 khóa học "Tạo đột phá" của Trường doanh nhân Dale Carnegie <br/> <b>2.</b> Hỗ trợ $200 phí vé máy bay<br />
						<b>3.</b> Hỗ trợ $200 lệ phí thi IELTS<br/>(*) Học sinh được chọn 1	trong 3 phần quà trên
					</p>
				</div>
			</div>
		</div>
		<br>
	</div>

	<!-- session4 -->
	<div class="session4">
		<div class="container text-center">
			<h3 style="color: #8fb934">
				<B>NGÀNH ĐÀO TẠO VÀ ĐỐI TƯỢNG TUYỂN SINH</B>
			</h3>
			<br>
			<div class="row">
				<div class="col-sm-6 ">
					<img src="image/object-left.png" class="img-responsive" width="80%"
						alt="Image">

				</div>
				<div class="col-sm-6 ">
					<img src="image/object-right.png" class="img-responsive"
						width="40%" alt="Image" style="margin-top: 70px">
				</div>
			</div>
			<button type="submit" id="bto" class="btn"
				style="color: white; width: 150px; background-color: #db8e1a; margin-top: 10px">
				<b>Đăng ký</b>
			</button>
		</div>
		<br>
	</div>

	<!-- University -->
	<div class="University">
		<div class="container text-center">
			<p class="right" style="right: 0px; margin: 50px 0 50px 0;">
				<img src="image/landing-page_19.png" />
			</p>
			<div class="row seven-cols">
				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-1.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">Australian<br />Catholic
								University
							</font>
						</p>
					</div>
				</div>

				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-2.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">Central Queensland<br />University
							</font>
						</p>
					</div>
				</div>

				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-3.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">University of<br />Sunshine
								Coast
							</font>
						</p>
					</div>
				</div>

				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-4.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">Queensland University<br />of
								Technology
							</font>
						</p>
					</div>
				</div>

				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-5.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">Southern Cross<br />University
							</font>
						</p>
					</div>
				</div>

				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-6.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">University of<br />Southern
								Queensland
							</font>
						</p>
					</div>

				</div>

				<div class="col-lg-1 col-md-3 col-sm-4 col-xs-6">
					<div class="staff-photo">
						<img src="image/University-7.jpg">
					</div>
					<div class="staff-name">
						<p align="center" style="margin-left: 5px;">
							<font face="Arial, Helvetica, sans-serif" color="#000"
								style="font-size: 12px;">Griffith University</font>
						</p>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!--Testimonials-->
	<div class="testimonials"
		style="height: 480px; background-color: #8CB33E;">
		<div class="container text-center">
			<div id="myCarousel" class="carousel slide" data-ride="carousel"
				style="width: 100%; background: url(image/emotion-bg.jpg) no-repeat; margin-right: 10%">
				<!-- Wrapper for slides -->
				<div class="carousel-inner">
					<div class="item active">
						<img src="./image/Slide1.png" alt="">
					</div>

					<div class="item">
						<img src="./image/Slide2.png" alt="">
					</div>

					<div class="item">
						<img src="./image/Slide3.png" alt="">
					</div>
					<div class="item">
						<img src="./image/Slide4.png" alt="">
					</div>
				</div>
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev"></a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next"></a>
			</div>

		</div>
	</div>

	<section style="width: 100%; background-color: #8D6000; height: 20px;">
	</section>
	<!-- Contact -->
	<section class="items text-center"
		style="width: 100%; background: #E49B18; height: 250px;">
		<div class="container"
			style="background-color: #E49B18; padding: 45px 0 30px 10px;">
			<p align="center" class="intro-text left"
				style="margin-bottom: 15px;">
				<img src="image/Landing-page_27.png" />
			</p>
			<p align="center" class="intro-text right">
				<font face="Arial, Helvetica, sans-serif" color="#FFF"
					style="font-size: 20px; line-height: 15pt;"><b>ĐẠI DIỆN
						CHÍNH THỨC CỦA HỌC VIỆN CÔNG NGHỆ SOUTHBANK, ÚC</b><br />Công ty tư
					vấn du học Lisa Ho<br />38/14 Trần Khắc Chân, Quận 1, Tp. Hồ Chí
					Minh<br />Hotline: 0963.9999.30 - 0909.343.048<br />Website:
					www.lisahostudyoverseas.com</font>
			</p>
			<div class="clear"></div>
		</div>
	</section>

	<footer class="container-fluid text-center footer"
		style="width: 100%; height: 45px; bottom: 0; position: fixed; z-index: 9999;">
		<h5 style="text-align: center">
			<b>KHAI GIẢNG: THÁNG 07/2014 VÀ THÁNG 01/2015 </b>
		</h5>
		<a id="itemscrolltop" href="#" onclick="scrollToTop();"
			style="z-index: 9999999"> <img src="image/go-to-top.png"
			height="40px"
			style="float: right; margin-top: -30px; margin-right: 5%;">
		</a>
	</footer>
	<!-- ./Footer -->
	<script>
		//scrollToTop
		function scrollToTop() {
			$('html, body').animate({
				scrollTop : 0
			}, 800);
		}

		//validate form slide
		$(document).ready(function() {
							var iName = $("#iHoten");
							var iPhone = $("#iPhone");
							var iNoio = $("#iNoio");
							var iTotNghiep = $("#iTotNghiep");
							var iNganhHoc = $("#iNganhHoc");
							var iEmail = $("#iEmail");
							$('#submit-slide')
									.click(
											function() {
												if (iName.val() == "") {
													$("#note")
															.html(
																	"Bạn chưa nhập họ tên");
													$("#iHoten").focus();
													return false;
												} else if (isValiPhone(iPhone
														.val()) == false) {
													$("#note")
															.html(
																	"Bạn chưa nhập hoặc nhập sai số điện thoại");
													$("#iPhone").focus();
													return false;
												} else if (iNoio.val() == null) {
													$("#note")
															.html(
																	"Bạn cần chọn nơi ở");
													return false;
												} else if (iTotNghiep.val() == null) {
													$("#note")
															.html(
																	"Bạn cần chọn cấp học đã tốt nghiệp");
													return false;
												} else if (iNganhHoc.val() == null) {
													$("#note")
															.html(
																	"Bạn cần chọn ngành học");
													return false;
												} else if (isValiEmail(iEmail
														.val()) == false) {
													$("#note")
															.html(
																	"Bạn chưa nhập hoặc nhập sai email");
													$("#iEmail").focus();
													return false;
												} else {
													alert("submit thanh cong!");
													return true;
												}
											});
						});
		function isValiEmail(email) {
			var reg = /^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$/;
			if (reg.test(email) == false) {
				return false;
			} else {
				return true;
			}
		}
		function isValiPhone(phone) {
			var reg = /^(01[0-9]{9}|09[0-9]{8})$/;
			if (reg.test(phone) == false) {
				return false;
			} else {
				return true;
			}
		}
	</script>

</body>

</html>