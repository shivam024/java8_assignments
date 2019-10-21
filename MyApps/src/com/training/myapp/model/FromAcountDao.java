package com.training.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.myapp.util.DBUtil;

public class FromAcountDao {
	public boolean addAccount(BankAccount account) {
		String query = "Insert into fromaccount (account_id,account_name,account_type,account_balance)  values(?,?,?,?) ";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setLong(1, account.getAccountId());
			statement.setString(2, account.getAccountName());
			statement.setString(3, account.getAccountType());
			statement.setDouble(4, account.getAccountBalance());
			int count = statement.executeUpdate();
			if (count == 1)
				return true;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return false;

	}

	public BankAccount findAccountById(long id) {
		String query = "Select * from fromaccount where account_id=" + id;
		BankAccount account = null;
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery();) {
			if (result.next())
				account = new BankAccount(result.getLong(1), result.getString(2), result.getString(3),
						result.getDouble(4));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;

	}

	public boolean updateBankAccount(long id, double account) throws SQLException {
		BankAccount account1 = findAccountById(id);
		System.out.println(account);

		String query = "UPDATE fromaccount SET account_balance=" + account + " WHERE account_id=" + id;
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			int count = statement.executeUpdate();
			if (count == 2)

				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
