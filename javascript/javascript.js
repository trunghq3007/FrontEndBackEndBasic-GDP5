function scrollToTop() {
    $('html, body').animate({ scrollTop: 0 }, 800);
}
function scrollToRegister() {
    $('html, body').animate({ scrollTop: 200 }, 800);
}
/* Start Click đăng ký handler */
var hasBeenClicked = false;
$(document).ready(function () {
    $("#txtPhone").keyup(function () {
        if (this.value.match(/[^0-9.]/g)) {
            this.value = this.value.replace(/[^0-9]/g, '');
        }
    });
    var txtName1 = $("#txtName");
    var txtPhone1 = $("#txtPhone");
    var drpCity1 = $("#drpCity");
    var drpGraduate1 = $("#drpGraduate");
    var drpMajor1 = $("#drpMajor");
    var txtMail1 = $("#txtMail");
    $('#btnRegister').click(function () {
        if (!hasBeenClicked) {
            hasBeenClicked = true;
            if (txtName1.val() != "" && txtPhone1.val() != "" && txtMail1.val() != "" && validateEmail(txtMail1.val()) == true && txtPhone1.val().length > 8 && drpGraduate1.val() != 0 && drpMajor1.val() != 0 && drpCity1.val() != 0) {
                $("#loading_wrap");
                var txtName = txtName1.val();
                var txtPhone = txtPhone1.val();
                var txtMail = txtMail1.val();
                var drpMajor = drpMajor1.val();
                var drpCity = drpCity1.val();
                var drpGraduate = drpGraduate1.val();
                var url = location.href;
                var myData = {txtName: txtName, txtPhone: txtPhone, txtMail: txtMail, drpMajor: drpMajor, drpCity: drpCity, drpGraduate: drpGraduate, URL: url };
                jQuery.ajax({
                    type: "POST",
                    url: "http://landingpage.novanet.vn/handle/HandleLisaHo.ashx",
                    dataType: "text",
                    data: myData,
                    success: function (msg) {
                        sleep(100);
                        window.alert(5 + 6);
                    },
                    error: function (xhr, ajaxOptions, thrownError) {
                        hasBeenClicked = false;
                        $("#loading_wrap").toggle();
                    }
                });
            }
            else if (txtName1.val() == "") {
                $("#note").html("Bạn chưa nhập tên");
                hasBeenClicked = false;
            }
            else if (txtPhone1.val().length < 9) {
                $("#note").html("Bạn chưa nhập đủ số điện thoại");
                hasBeenClicked = false;
            }
            else if (drpCity1.val() == 0 || drpCity1.val() == "" || drpCity1.val() == "Nơi ở...") {
                $("#note").html("Bạn cần chọn nơi ở");
                hasBeenClicked = false;
            }
            else if (drpGraduate1.val() == 0 || drpGraduate1.val() == "" || drpGraduate1.val() == "Bạn đã tốt nghiệp ?") {
                $("#note").html("Bạn cần chọn cấp học đã tốt nghiệp");
                hasBeenClicked = false;
            }
            else if (drpMajor1.val() == 0 || drpMajor1.val() == "" || drpMajor1.val() == "Ngành Đăng Ký") {
                $("#note").html("Bạn cần chọn ngành học");
                hasBeenClicked = false;
            }
            else if (validateEmail(txtMail1.val()) == false) {
                $("#note").html("Bạn chưa nhập hoặc nhập sai email");
                hasBeenClicked = false;
            }
        }
    });
});
function validateEmail(email) {
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    if (reg.test(email) == false) {
        return false;
    }
    else {
        return true;
    }
}
function sleep(milliseconds) {
    var start = new Date().getTime();
    for (var i = 0; i < 1e7; i++) {
        if ((new Date().getTime() - start) > milliseconds) {
            break;
        }
    }
}