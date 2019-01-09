window.onload = function() {
    document.addEventListener("click", function(e) {
        if(e.target.id == "submitButton") {
        	console.log("vao day");
            if(!validateForm()) {
                e.preventDefault();
            }
        }
    });
};

//$(document).ready(function() {
//	$("#submitButton").click(function() {
//		if (validateForm()) {
//			var form = $('form[name="registForm"]');
//			var formData = new FormData(form);
//			$.ajax({
//				type : 'POST',
//				url : 'home',
//				data : formData,
//				proccessData : false,
//				contentType : false,
//				success : function(data) {
//					alert(data);
//				},
//				error : function(xhr, status, error) {
//
//				}
//			});
//		}
//	});
//});

function validateForm() {
	var message = "";
	var signupForm = document.forms["registForm"];
	var username = signupForm["fullName"];
	var phone = signupForm["phone"];
	var address = signupForm["address"];
	var graduation = signupForm["graduation"];
	var major = signupForm["major"];
	var email = signupForm["email"];

	if (!username.value) {
		message += "Tài khoản";
	}
	if (!phone.value) {
		message += " Số điện thoại";
	}
	if (!address.value) {
		message += " Địa chỉ";
	}
	if (graduation.value == "0") {
		message += " Tốt nghiệp";
	}

	if (major.value == "0") {
		message += " Ngành đăng kí";
	}

	if (!email.value) {
		message += " Email";
	}

	if (message) {
		message += " Không hợp lệ.";
		alert(message);
		return false;
	}
	return true;
}