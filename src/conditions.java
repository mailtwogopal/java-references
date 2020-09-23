
public class conditions {

	public static void main(String[] args) {
		// conditions assignments
		
		//voting age check
		int age = 10;
		if (age >= 18) {
			System.out.println("You are allowed to vote in election");
		}
		else {
			System.out.println("You are not eligible to vote in election");
		}
		
		//check number is +ve or -ve
		int num = 1;
		if (num > 0 ) {
			System.out.println(num + " is positive");
		}
		else if (num < 0) {
			System.out.println(num + " is negative");
		}
		else {
			System.out.println(num + " is zero");
		}
		
		//check largest of two numbers
		
		int number1 = 0;
		int number2 = -1;
		
		if( number1 > number2) {
			System.out.println("number1 is greater");
		}
		else if (number1 < number2){
			System.out.println("number2 is greater");
		}
		else {
			System.out.println("both are equal");
		}
		
		//check if number is odd or even
		
		int numGiven = 95;
		
		if (numGiven %2 == 0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
	}

}
