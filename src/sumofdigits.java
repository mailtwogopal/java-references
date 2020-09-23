
public class sumofdigits {
	
	public static void main(String[] args) {
		
		//add digits of a number
		System.out.println("using while");
		int num = 453098;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = digit + sum;
			num = num/10;
		}
		System.out.println("sum of given digits in a number is " + sum);
		
		System.out.println("\n");
		System.out.println("using do-while");
		int nums = 1254;
		int sums = 0;
		 do{
			int digits = nums % 10;
			sums = digits + sums;
			nums = nums/10;
		}while (nums > 0);
		 System.out.println("sum of given digits in a number is " + sums);
		 
		 System.out.println("\n");
		 System.out.println("using for loop");
		 int numtoadd;
		 int sumofdigits = 0;
		 for (numtoadd = 256; numtoadd > 0;) {
			 int dig = numtoadd % 10;
			 sumofdigits = dig + sumofdigits;
				numtoadd = numtoadd/10;
		 }
		 System.out.println("sum of digits using for loop is " + sumofdigits);
		 
	}

}
