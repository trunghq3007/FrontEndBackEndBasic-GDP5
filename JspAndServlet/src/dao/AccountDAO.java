package dao;

import entity.Account;

public interface AccountDAO {
	// Constant
	Account getAccount(String username);

	boolean validateAccount(String username, String password);
}
