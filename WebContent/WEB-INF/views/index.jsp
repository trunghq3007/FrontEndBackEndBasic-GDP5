<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
    <link rel="stylesheet" href="${bootstrap}/css/bootstrap.min.css">
    <script src="${js }/jquery.js"></script>
    <script src="${bootstrap }/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${css }/custom_css.css">
    <title>Example html 1</title>
</head>
<body>
   
    <header>
        <div class="container-fluid custom-header" >
            <div class="row header-logo" >
                <div class="col-md-4">
                    <div class="logo">
                            <img src="${img}/logo-lisaho.png" alt="logo of webside" >
                            <img src="${img}/logo-southbank.png" alt="logo of webside">
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="header-phone">
                            <b>HOTLINE: 0987783399 - 099734933</b>
                    </div>
                    
                </div>
                 <div class="col-md-4">
                 	<c:if test="${isLogin}">
      					<span>${userName }</span>
                    	<a href="" class="btn btn-default">Đăng xuất</a>
					</c:if>
                    <c:if test="${!isLogin}">
      					<a href="${pageContext.request.contextPath }/login" class="btn btn-default">Đăng nhập</a>
                    	<a href="${pageContext.request.contextPath }/register" class="btn btn-default">Đăng ký</a>
					</c:if>
                 	
                </div>
            </div>
        </div>
        <div class="container banner-box">
            <img src="${img}/slide.jpg" alt="slide banner" class="silde-banner">
            <div class="register-box">
                <h3 class="banner-title-1">HỌC VIỆN CÔNG NGHỆ SOUTBANK, ÚC</h3>
                <P class="banner-title-2">Bạn còn thắc mắc về du học úc. Vui lòng để lại thông tin dưới đây chúng tôi sẽ liên hệ nhanh nhất</P>
                <form action="${pageContext.request.contextPath }/home" method="post" id="formData" >
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Họ và tên" name="name" id="name">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Điện thoại" name="phone" id="phone">
                    </div>
                    <div class="form-group">
                        <select  class="form-control" name="address" id="address" >
                            <option value="0">Nơi ở...</option>
                            <option value="Ninh Bình">Ninh Bình</option>
                            <option value="Hà nội">Hà nội</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <select  id="graduation"  class="form-control" name="graduation" >
                            <option value="0">Bạn đã tốt nghiệp ?</option>
                            <option value="Chưa">Chưa</option>
                            <option value="Rồi">Rồi</option>
                        </select>
                    </div> 
                    <div class="form-group">
                        <select  id="major" class="form-control" name="major">
                            <option value="0">Ngành đăng ký ?</option>
                            <option value="Công nghệ thông tin">Công nghệ thông tin</option>
                            <option value="Dầu khí">Dầu khí</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Email"  name="email" id="email">
                    </div>
                    <div class="form-group ">
                        <button type="button" class="btn-register" id="btn-register" >Đăng ký</button>  
                    </div>
                </form>
            </div>
        </div>
    </header>
    <div class="container content-1">
        <h3 class="content-title_1">CÁC BƯỚC ĐỂ DU HỌC THÀNH CÔNG</h3>
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <img src="${img}/add-1.jpg" alt="">
                <h4 class="content-box_title">BƯỚC 1: ĐĂNG KÝ</h4>
                <P>Đăng ký để lại thông tin của bạn</P>
            </div>
            <div class="col-md-3 col-sm-6">
                <img src="${img}/add-2.jpg" alt="">
                <h4 class="content-box_title">BƯỚC 2: ĐƯỢC TƯ VẤN TỪ BỘ PHẬN TUYỂN SINH</h4>
                <P>Chuyên gia tư vấn của chúng tôi sẽ giúp bạn chọn ngành học phù hợp</P>
            </div>
            <div class="col-md-3 col-sm-6">
                <img src="${img}/add-3.jpg" alt="">
                <h4 class="content-box_title">BƯỚC 3: HOÀN THÀNH HỒ SƠ</h4>
                <P>Chuyên gia tư vấn sẽ hỗ trợ bạn hoàn thành hồ sơ nhập học và visa chu đáo </P>
            </div>
            <div class="col-md-3 col-sm-6">
                <img src="${img}/add-4.jpg" alt="">
                <h4 class="content-box_title">BƯỚC 4: TRẢI NGHIỆM HỌC TẬP QUỐC TẾ</h4>
                <P>Bắt đầu học tập tại môi trường hàng đầu thế giới</p>
            </div>
        </div>
        <div>
            <button type="button" class="content-box_btnRegister-1">Đăng ký</button>
        </div>
    </div>
    <div class=" content-2">
            <h3 class="content-title_2">LỢI ÍCH KHI THAM GIA HỌC TẬP TẠI HỌC VIỆN SOUTHBANK</h3>
            <div class="row">
                <div class="col-md-2 col-sm-3">
                    <img src="${img}/benefit-1.jpg" alt="">
                    <P>Không cần thi đầu vào</P>
                </div>
                <div class="col-md-2 col-sm-3">
                    <img src="${img}/benefit-2.jpg" alt="">
                    <P>Không cần chứng minh tài chính</P>
                </div>
                <div class="col-md-2 col-sm-3">
                    <img src="${img}/benefit-3.jpg" alt="">
                    <P>Học phí và phí sinh hoạt cạnh tranh</P>
                </div>
                <div class="col-md-2 col-sm-3">
                    <img src="${img}/benefit-4.jpg" alt="">
                    <P>Đội ngũ giáo viên là những chuyên gia trong những lĩnh vực chuyên môn, giàu kinh nghiệm trong việc giảng dạy học sinh quốc tế</P>
                </div>
                <div class="col-md-2 col-sm-3">
                    <img src="${img}/benefit-5.jpg" alt="">
                    <p>25 chương trình chuyển tiếp vào các trường đại học hàng đầu của Úc sẽ giúp sinh viên hoàn thành con đường học vấn đỉnh cao</p>
                </div>
                <div class="col-md-2 col-sm-3">
                    <img src="${img}/benefit-6.jpg" alt="">
                    <p>Sau khi tốt nghiệp học sinh được phép ở lại làm việc hai năm ở Úc</p>
                </div>

            </div>
            
    </div>
    <div class="content-3">
        <h3 class="content-title_3">LỢI ÍCH KHI THAM GIA HỌC TẬP TẠI HỌC VIỆN SOUTHBANK</h3> 
        <div class="col-md-3 col-sm-6">
            <img src="${img}/benefit-2-1.png" alt="" class="img-circle">
            <h3 class="content-3_box-item_title">VỀ CHÚNG TÔI</h3>
            <p>Công ty tư vấn du học LasaHo do ông kelvin Chu -  người úc có nhiều năm kinh nghiệm trong lĩnh vực giáo dục và đào tạo nghề tại úc thành lập</p>
        </div>
        <div class="col-md-3 col-sm-6">
            <img src="${img}/benefit-2-2.png" alt="" class="img-circle">
            <h3 class="content-3_box-item_title">Giá TRỊ "3C"</h3>
            <p>Học sinh nhận được sự tư vấn hoàn thiện<br>
                - Củng cố nền tảng<br>
                - Chọn trường phù hợp<br>
                - Cơ hội nghề nghiệp
            </p>
        </div>
        <div class="col-md-3 col-sm-6">
            <img src="${img}/benefit-2-3.png" alt="" class="img-circle">
            <h3 class="content-3_box-item_title">MIỄN PHÍ TƯ VẤN 100%</h3>
            <p>Công ty tư vấn du học LasaHo do ông kelvin Chu -  người úc có nhiều năm kinh nghiệm trong lĩnh vực giáo dục và đào tạo nghề tại úc thành lập</p>
        </div>
        <div class="col-md-3 col-sm-6">
            <img src="${img}/benefit-2-4.png" alt="" class="img-circle">
            <h3 class="content-3_box-item_title">QUÀ TẶNG GIÁ TRỊ</h3>
            <p>Công ty tư vấn du học LasaHo do ông kelvin Chu -  người úc có nhiều năm kinh nghiệm trong lĩnh vực giáo dục và đào tạo nghề tại úc thành lập</p>
        </div>
    </div>
    <div class="clr">
        
    </div>
    <div class="content-4">
        <h3 class="content-title_4">NGÀNH ĐÀO TẠO & ĐỐI TƯỢNG TUYỂN SINH</h3>
        <div class="row">
            <div class="col-md-6 col-md-offset-1">
                <img src="${img}/object-left.png" alt="">
            </div>
            <div class="col-md-5">
                <!-- <img src="${img}/object-right.png" alt=""> -->
                <ul class="checkmark">
                    <li> Hoàn tất lớp 10</li>
               
                    <li> Hoàn tất lớp 11</li>
               
                    <li> Hoàn tất lớp 12</li>
                </ul>
            </div>

        </div>
        <div class="" style="text-align: center;">
            <button type="button" class="content-box_btnRegister-1">Đăng ký</button>
        </div>
    </div>
    <div class="container-fluid go_to_top">
        <h4>Khai giảng: 7/2014 và Tháng 1/2015</h4>
 
        <img src="${img}/go-to-top.png" alt="" style="float: right;border: none;display: none" id="btn-go-top" onclick="topFunction()">
        
    </div>
</body>
<script>
    window.onscroll = function() {scrollFunction()};
// || document.documentElement.scrollTop > 50
    function scrollFunction() {
        if (document.body.scrollTop > 200 || document.documentElement.scrollTop > 200) {
            document.getElementById("btn-go-top").style.display = "block";
        } else {
            document.getElementById("btn-go-top").style.display = "none";
        }
    }
   function topFunction() {
        document.body.scrollTop = 0;
        document.documentElement.scrollTop = 0;
    }
    function isValidation(){
        // e.preventDefault();
        var messeges ='';
        var check = true ;
        var name = document.getElementById('name').value;
        var phone = document.getElementById('phone').value;
        var email = document.getElementById('email').value;
        name = name.replace(/\s+/gi,"");
        var pattern_email = /^[a-zA-Z][\w-]+@([\w]+\.[\w]+|[\w]+\.[\w]{2,}\.[\w]{2,})$/gi;

        var pattern_phone = /^[0-9]{10,11}$/gi;
        console.log(name) ;
        if(!name){
            messeges = messeges.concat("tên không để trống\n") ;
            check = false ;
        }
        if(!pattern_phone.test(phone)){
            messeges = messeges.concat("số điện thoại không đúng quy định\n");
            check = false ;
        }
        if(!pattern_email.test(email)){
            messeges = messeges.concat("Email không đúng định dạng\n");
            check = false ;
        }
       // alert(messeges);
       return check ;
    }
    $(document).ready(function(){
    	
         $("#btn-register").on('click',function(e){
        	 if(isValidation()){
     
        		 var obj_data = {};
        		 var form_array = $("#formData").serializeArray();
        		 $.each(form_array,function(k,v){
        			 
        			 var element ={};
        			 element[v.name] = v.value ;
        			 Object.assign(obj_data, element);
        		 });
        		console.log(obj_data);
        		 
                 $.ajax({
                     url: "${pageContext.request.contextPath }/home",
                    // headers : {
                    // // },
                      data:obj_data,
                      type: 'post',
                      //processData: false,
                     // contentType: false,
                     success: function(response){
                         console.log("vào đây");
                         console.log(response);
                         alert(response);
                         // $('.banner-box').after(response);
                     },
                     error : function(){

                    }
                 }); 
        	 }else{
        		 alert("Dữ liệu vào không hợp lý");
        	 }
            
         }); 
      
      
    });
</script>
</html>