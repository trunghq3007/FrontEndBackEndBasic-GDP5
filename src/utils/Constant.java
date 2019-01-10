package utils;

public interface Constant {
	public interface UserContact {
		public static final String fullName = "name";
		public static final String phone = "phone";
		public static final String address = "address";
		public static final String isGraduation = "graduate";
		public static final String major = "major";
		public static final String email = "email";
		public static final String INSERT = " insert into contact (" + fullName + "," + phone + "," + address + ","
				+ isGraduation + "," + major + "," + email + ") values(?,?,?,?,?,?)";
	}
	public interface User {
		public static final String userame = "username";
		public static final String password = "password";
		public static final String INSERT = " insert into contact (" + userame + "," + password + ") values(?,?)";
		public static final String SELECT_LOGIN = " select * from  user where username = ? and password = ?";
	}
}
