
function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}
function validation() {
    var user = $('#username').val();
    if (user == "") {
        $('#message-username-error').text("username không được để trống");
    }
    var email = $('#email').val();
    if (email != "" && !validateEmail(email)) {
        $('#message-email-error').text('Email không đúng định dạng example: dthuan@gamil.com, dthuan@yahools.com');
    }
}