package code.java;



public class Account {
	int accNumber;
	double amount;
	String name;
	public void insert(int a, double amt, String n) {
		accNumber = a;
		amount = amt;
		name = n;
	}
	public void deposit(double amt) {
		amount = amount+amt;
		System.out.println(amount);
		
	}
	
	
}
