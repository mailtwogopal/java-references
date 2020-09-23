
public class oddandeven {

	public static void main(String[] args) {
		//print out ten even and odd numbers
		System.out.println("using while");
		int i = 1;
		while (i < 21) {
			if(i % 2 == 0) {
				System.out.println(i + " is an even number");
			}
			else {
				System.out.println(i + " is an odd number");
			}
			i++;
		}
		System.out.println(i + " is greater than 20");
		System.out.println("\n");
		System.out.println("using do-while");
		int i1 = 1;
		do {
			if(i1 % 2 == 0) {
				System.out.println(i1 + " is an even number");
			}
			else {
				System.out.println(i1 + " is an odd number");
			}
			i1++;
		}while (i1 < 21) ;
		System.out.println(i1 + " is greater than 20");
		System.out.println("\n");
		System.out.println("using for loop");
		int i2;
		for (i2 =1; i2 < 21; i2++) {
			if(i2 % 2 == 0) {
				System.out.println(i2 + " is an even number");
			}
			else {
				System.out.println(i2 + " is an odd number");
			}
		}
		System.out.println(i2 + " is greater than 20");
	}

}
