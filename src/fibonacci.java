import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		// generate 10 fibonacci numbers
		System.out.println("using while");
		int count = 10;
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		//System.out.println(num2);
		int num = 1;
		
		//using while loop
		while (num < count) {
			int sumOfPreviousTwoNum = num1 + num2;
			num1 = num2;
			num2 = sumOfPreviousTwoNum;
			num++;
			System.out.println(num1);
		}
		System.out.println("\n");
		System.out.println("using do-while");
		//using do-while
		int counts = 10;
		int num3 = 0;
		int num4 = 1;
		System.out.println(num3);
		//System.out.println(num2);
		int number = 1;
		do {
			int previousSum = num3 + num4;
			num3 = num4;
			num4 = previousSum;
			number++;
			System.out.println(num3);
		}
		while (number < counts);
		
		//using for loop
		System.out.println("\n");
		System.out.println("using for loop");
		int countofnum = 10;
		int num5 = 0;
		int num6 = 1;
		System.out.println(num5);
		//System.out.println(num2);
		int iterator;
		for (iterator = 1; iterator < countofnum; iterator++) {
			int previousnumSum = num5 + num6;
			num5 = num6;
			num6 = previousnumSum;
			System.out.println(num5);
		}
		
	}

}
