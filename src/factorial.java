
public class factorial {

	public static void main(String[] args) {
		//factorial for any given number
		System.out.println("using while");
		int i = 10;
		int factorial;
		factorial = i;
		while (i > 1) {
			factorial = factorial * (i - 1);
			i--;
		}
		System.out.println("factorial is " + factorial);
		System.out.println("\n");
		System.out.println("using do while");
		int j = 10;
		int facto;
		facto = j;
		 do {
			facto = facto * (j - 1);
			j--;
		}while (j > 1);
		System.out.println("factorial is " + facto);
		System.out.println("\n");
		System.out.println("using for loop");
		int j1;
		int factor = 10;
		for (j1 = 10; j1 > 1; j1--) {
			factor = factor * (j1 - 1);
		}
		System.out.println(factor);
	}

}
