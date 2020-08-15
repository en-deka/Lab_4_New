
public class Account {
	static int numAccounts = 0;

	Account() {
		numAccounts = numAccounts + 1;
	}
	
	public static void main(String[] args) {
		
		
		 
		Account obj1 = new Account();
		Account obj2 = new Account();
		Account obj3 = new Account();
		Account obj4 = new Account();
		
		
		System.out.println("There are " + numAccounts +  " accounts.");
		
		
	}
	
	static int getNumAccounts() {return numAccounts;

}}
