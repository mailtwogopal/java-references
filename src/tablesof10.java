
public class tablesof10 {

	public static void main(String[] args) {
		//tables of 10
		
		int num = 1;
		System.out.println("using while loop");
		while (num <= 10) {
			System.out.println("10 * " + num + " = " + num*10);
			num++;
		}
		System.out.println("\n");
		System.out.println("using do-while");
		int number = 1;
		do {
			System.out.println("10 * " + number + " = " + number*10);
			number++;
		} while(number <= 10);
		
		System.out.println("\n");
		System.out.println("using for loop");
		int iterator;
		for (iterator = 1; iterator <= 10; iterator++) {
			System.out.println("10 * " + iterator + " = " + iterator*10);
		}

	}

}
