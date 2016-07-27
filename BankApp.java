
public class BankApp {
	public static void main(String[] args){
		
		Address add = new Address("105 Central Ave", "Fremont", "NY", 12084);
		Balance bal = new Balance(11000.00);
		Transaction[] transArray = new Transaction[3];
		transArray[0] = new Transaction(4536729, 100.00);
		transArray[1] = new Transaction(4536730, 200.00);
		transArray[2] = new Transaction(4536731, 300.00);
		
		//ac.setTransaction(transArray);
		
		for(Transaction trans: transArray){
			System.out.println("Receiver Account No: "+ trans.getReceiverAccount());
			System.out.println("Receiver Amount: "+ trans. getAmount());
		}
		//Transaction trans1 = new Transaction(4536729, 100.00);
		
		Account ac = new Account(12345678, "Savings", "Active", bal);
		ac.setTransaction(transArray);
		Customer user = new Customer(10001, "Susan", add, "user@gmail.com", "4358764578", "111111111", ac);
		
		System.out.println("Customer name :"+user.getName()+"\n Customer Id :"+user.getCustomerId());
		System.out.println("Account Number :"+user.getAccount().accountNumber);
	}
}
