
public class Account {
	int accountNumber;
	String accountType;
	String acStatus;

	Balance balance;
	Transaction[] transaction;

	public Account(int accountNumber, String accountType, String acStatus, Balance balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.acStatus = acStatus;
		this.balance = balance;
	}
	
	public Transaction[] getTransaction() {
		return transaction;
	}
	
	public void setTransaction(Transaction[] transaction) {
		this.transaction = transaction;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAcStatus() {
		return acStatus;
	}
	public void setAcStatus(String acStatus) {
		this.acStatus = acStatus;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}

	
}
