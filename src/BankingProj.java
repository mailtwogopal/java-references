import java.util.Scanner;

abstract class Account //abstract denotes this class cannot be instantiated
{
	String accNumber;
	String accName;
	double Amount;
	
	void withdraw() {
		System.out.println("withdrawn from account");
	}
	
	void deposit() {
		System.out.println("amount deposited in account");
	}

	protected abstract void createAccount();
	
}

final class currAcc extends Account //final denotes this class cannot be a base class
{
	final float minBalance = 250;
	currAcc(){ //constructor
		accNumber = "cu12345";
		accName = "Current";
	}
	void withdraw() { //method overriding in inherited class with method from parent class
		System.out.println("withdrawn from current account");
	}
	
	void deposit() {
		System.out.println("amount deposited in current account " + minBalance);
	}
	
	protected void createAccount() {
		System.out.println("current account created");
		System.out.println("account details are " + accNumber + " " + accName);
	}
}

final class sbaccount extends Account
{
	final float minBalance = 100;
	sbaccount(){
		accNumber = "sb12345";
		accName = "SB";
	}
	void withdraw() {
		System.out.println("withdrawn from SB account");
	}
	
	void deposit() {
		System.out.println("amount deposited in SB account " + minBalance);
	}
	
	protected void createAccount() {
		System.out.println("sb account created");
		System.out.println("account details are " + accNumber + " " + accName);
	}
}
public class BankingProj {

	public static void main(String[] args) {
		Account acc;
		Scanner sc = new Scanner(System.in);
		System.out.println("What type of transaction you are going to do withdraw or create account? ");
		System.out.println("Enter W to withdraw or C to create new account");
		String transactionType = sc.nextLine();
		System.out.println("You choose to " + transactionType);
		if( transactionType.equalsIgnoreCase("W")) {
			System.out.println("Enter your account number to withdraw");
			String accNumber = sc.nextLine();
			accNumber = accNumber.substring(0, 2); 
			//0 is start index and 2 end index - returns (see next line)
			//char 0 & 1 excluding index 2
			if (accNumber.equalsIgnoreCase("sb")) {
				acc = new sbaccount();
				acc.withdraw();
			}
			else {
				acc = new currAcc();
				acc.withdraw();
			}
			
		}
		else {
		System.out.println("Which type of account you want to create ? ");
		String typeOfAcc = sc.nextLine();
		System.out.println("You choose to create account of type " + typeOfAcc);
		if (typeOfAcc.equalsIgnoreCase("sb")) {
			acc = new sbaccount();
			acc.createAccount();
			acc.deposit();
			
		}
		else {
			acc = new currAcc();
			acc.createAccount();
			acc.deposit();
		}
		}

	}

}
