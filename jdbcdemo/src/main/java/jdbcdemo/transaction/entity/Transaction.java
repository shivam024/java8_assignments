package jdbcdemo.transaction.entity;//verify , deposit , withdraw , inquiry , transfer

public class Transaction {
	int transactionId;
	String namePerson;
	int depositAmmount;
	int withdrawammount;
	double balanceInquiry;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public int getDepositAmmount() {
		return depositAmmount;
	}

	public void setDepositAmmount(int depositAmmount) {
		this.depositAmmount = depositAmmount;
	}

	public int getWithdrawammount() {
		return withdrawammount;
	}

	public void setWithdrawammount(int withdrawammount) {
		this.withdrawammount = withdrawammount;
	}

	public double getBalanceInquiry() {
		return balanceInquiry;
	}

	public void setBalanceInquiry(double balanceInquiry) {
		this.balanceInquiry = balanceInquiry;
	}

	public Transaction(String namePerson, int depositAmmount, int withdrawammount, double balanceInquiry) {
		super();
		this.namePerson = namePerson;
		this.depositAmmount = depositAmmount;
		this.withdrawammount = withdrawammount;
		this.balanceInquiry = balanceInquiry;
	}

	public Transaction(int transactionId, String namePerson, int depositAmmount, int withdrawammount,
			double balanceInquiry) {
		super();
		this.transactionId = transactionId;
		this.namePerson = namePerson;
		this.depositAmmount = depositAmmount;
		this.withdrawammount = withdrawammount;
		this.balanceInquiry = balanceInquiry;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", namePerson=" + namePerson + ", depositAmmount="
				+ depositAmmount + ", withdrawammount=" + withdrawammount + ", balanceInquiry=" + balanceInquiry + "]";
	}

}
