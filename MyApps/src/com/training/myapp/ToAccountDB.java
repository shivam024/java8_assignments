package com.training.myapp;

import java.sql.SQLException;

import com.training.myapp.exception.LowBalanceException;
import com.training.myapp.model.BankAccount;

import com.training.myapp.model.ToAccountDao;

public class ToAccountDB {
	public static void main(String[] args) throws LowBalanceException, SQLException {
		ToAccountDao account=new ToAccountDao();
		if(account.addAccount(new BankAccount(5678, "Arjun", "Savings", 80000))) {
		System.out.println("Account is added");
	}
	else
		System.out.println("Failed to add account");
		//to display the element by id
		//BankAccount student = account.findAccountById(1001);
	//if(student != null)
//		System.out.println(student);
//		else
	//System.out.println("-- Employee Record not found --");	
//	BankAccount accountNew=new BankAccount();
//
//
//
//		
//
//	if(account.updateBankAccount(1001,student.withdraw(1000)))
//		System.out.println("Balance updated");
//		else
//			System.out.println("failed to update balance");
	}

}
