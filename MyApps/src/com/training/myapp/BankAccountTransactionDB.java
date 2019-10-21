package com.training.myapp;

import java.sql.SQLException;
import java.time.LocalDateTime;

import com.training.myapp.model.BankAccountTransaction;
import com.training.myapp.model.FromAcountDao;
import com.training.myapp.model.ToAccountDao;
import com.training.myapp.model.Transaction;

public class BankAccountTransactionDB {
public static void main(String[] args) throws SQLException {
	BankAccountTransaction fund=new BankAccountTransaction();
	FromAcountDao fAccount=new FromAcountDao();
	ToAccountDao tAccount=new ToAccountDao();
	Transaction transact=new Transaction();
	
	
//	if(fund.transactionBetweenTwoAccounts(fAccount.findAccountById(1001),tAccount.findAccountById(1234),new Transaction(123, LocalDateTime.now(), 50000) )) {
//		System.out.println("amount transaction is successfull");}
//	else
//		System.out.println("transaction failed");
	//using callable statement
	if(fund.fundTransfer(fAccount.findAccountById(1002), tAccount.findAccountById(5678), new Transaction(456, LocalDateTime.now(), 500) ))
		System.out.println("amount transaction is successfull");
	else
		System.out.println("transaction failed");
}
}
