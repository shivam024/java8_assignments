package com.training.myapp.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.myapp.util.DBUtil;

public class BankAccountTransaction {
	public boolean transactionBetweenTwoAccounts(BankAccount fromAccount, BankAccount toAccount,
			Transaction transaction) throws SQLException {
		Connection connection = DBUtil.getConnection();

		try {
			connection.setAutoCommit(false);

			try (Statement statement = connection.createStatement()) {

				statement.addBatch("update fromaccount set account_balance="+ fromAccount.withdraw(transaction.getTransactionAmount()) + "where account_id="+ fromAccount.getAccountId());
				statement.addBatch("update toaccount set account_balance=" + toAccount.deposit(transaction.getTransactionAmount())+ "where account_id=" + toAccount.getAccountId());

				int[] affectedrecords = statement.executeBatch();
				//System.out.println(affectedrecords.length);
				
				connection.commit();
				if(affectedrecords.length==2) {
					System.out.println(transaction.toString());
				return true;
				}
			}
		} catch (Exception e) {
			connection.rollback();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return false;

	}
	//using callable statement
	public boolean fundTransfer(BankAccount fromAccount, BankAccount toAccount, Transaction transaction) {
		
		String query = "{ call FUNDTRANSFER(?, ?, ?,?,?)}";
		
		try (Connection connection = DBUtil.getConnection();
			 CallableStatement statement = connection.prepareCall(query)) {
			
			statement.setLong(1, fromAccount.getAccountId());
			statement.setLong(2, toAccount.getAccountId());
			statement.setDouble(3, transaction.getTransactionAmount());
			statement.executeUpdate();
			statement.registerOutParameter(4,java.sql.Types.DOUBLE);
			statement.registerOutParameter(5, java.sql.Types.DOUBLE);
			//System.out.println("hii");
			double toAccBlnce = statement.getDouble(4);
			System.out.println("Account Balance of ToAccount"+toAccBlnce);
			double fromAccBlnce = statement.getDouble(5);
			System.out.println("Account Balance of From Acount"+fromAccBlnce);
			return true;		
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}





















