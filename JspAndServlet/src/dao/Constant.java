package dao;

public interface Constant {

	public interface Account {

		// account field
		public static final String USER_NAME = "username";
		public static final String PASSWORD = "password";

		// query
		public static final String SQL_GET_ACCOUNT = "select * from account where " + USER_NAME + "=? and " + PASSWORD
				+ "=?";
		// common
		public static final String SAVE_ACCOUNT_INTO_SESSION = "sessionSave";
		public static final String SAVE_ACCOUNT_INTO_COOKIES = "cookieSave";

		// message response
		public static final String LOGIN_FAIL = "<h4>Đăng nhập thất bại</h4><a href=\"login\">Quay lại</a>";
	}

	public interface UserInfo {

		// user info field
		public static final String FULL_NAME = "fullname";
		public static final String ADDRESS = "address";
		public static final String PHONE = "phone";
		public static final String GRADUATION = "isgraduation";
		public static final String EMAIL = "email";
		public static final String MAJOR = "major";

		// query
		public static final String SQL_INSERT_USER_INFO = "insert into userinfo(" + FULL_NAME + ", " + PHONE + ", "
				+ ADDRESS + ", " + GRADUATION + ", " + MAJOR + ", " + EMAIL + ") values(?,?,?,?,?,?)";

		// message response
		public static final String INSERT_USER_INFO_SUCCESS = "<h4>Đăng kí thành công</h4><a href=\"home\">Quay lại</a>";
		public static final String INSERT_USER_INFO_FAIL = "Đăng kí thất bại";

	}

}
