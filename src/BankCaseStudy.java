import java.util.Scanner;

abstract class Bank 
{
	double roi;
	abstract void rateOfInterest();
}

class sbi extends Bank
{
	sbi(){
		roi = 4.56;
	}
	void rateOfInterest() {
		System.out.println("Rate of interest in sbi is " + roi);
	}
}

class icici extends Bank
{
	icici(){
		roi = 5.86;
	}
void rateOfInterest() {
	System.out.println("Rate of interest in icici is " + roi);
	}
}
public class BankCaseStudy {

	public static void main(String[] args) {
		Bank bank;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name to view rate of interest");
		String bankName = sc.nextLine();
		if (bankName.equalsIgnoreCase("icici")) {
			bank = new icici();
			bank.rateOfInterest();
		}
		else {
			bank = new sbi();
			bank.rateOfInterest();
		}

	}

}
