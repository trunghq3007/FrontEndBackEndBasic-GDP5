package com.utils;

public interface Constants {
	interface contact {
		//

		 public static final String CONTACT_ALLCONTACT = "SELECT * FROM asm_qldh.contact;";
		 public static final String CONTACT_ID = "id";
		 public static final String CONTACT_NAME = "name";
		 public static final String CONTACT_PHONE = "phone";
		 public static final String CONTACT_ADDRESS = "address";
		 public static final String CONTACT_GRADUATE = "graduate";
		 public static final String CONTACT_MAJOR = "major";
		 public static final String CONTACT_EMAIL = "email";
		 public static final String CONTACT_SERLECT = "INSERT INTO asm_qldh.contact (name, phone, address, graduate, major, email) VALUES (?, ?, ?, ?, ?, ?);";
		 public static final String CONTACT_DELETE="delete from asm_qldh.contact where id=?;";
	}
	
	
	interface user {
		public static final String USER_ID = "id";
		 public static final String USER_USERNAME = "username";
		 public static final String USER_PASSWORD = "password";
		// query string select one by code
 		public static final String SELECT_ONE = "select * from asm_qldh.user where username=? and password=?;";
 		 public static final String USER_ALLUSE = "SELECT * FROM asm_qldh.user;";
	}
}
