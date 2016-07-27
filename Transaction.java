
public class Transaction {
	int receiverAccount;
	double amount;
	
	public Transaction(){
		
	}
	
	public Transaction(int receiverAccount, double amount) {
		this.receiverAccount = receiverAccount;
		this.amount = amount;
	}

	public int getReceiverAccount() {
		return receiverAccount;
	}
	public void setReceiverAccount(int receiverAccount) {
		this.receiverAccount = receiverAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
