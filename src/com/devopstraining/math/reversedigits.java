package com.devopstraining.math;

public class reversedigits {
	
	public void reverseForLoop(int number) {
		int numtoRev, newNumber = 0;
		for (numtoRev = number; numtoRev > 0;) {
			int dig = numtoRev % 10;
			newNumber = newNumber * 10 + dig;
			numtoRev = numtoRev/10;
		}
		System.out.println(newNumber);
	}

	public static void main(String[] args) {
		// reverse digits of a number
		System.out.println("using while");
		int number = 213501;
		int newNum = 0;
		while (number > 0) {
			int digit = number % 10;
			newNum = newNum * 10 + digit;
			number = number / 10;
		}
		System.out.println(newNum);
		System.out.println("\n");
		System.out.println("using do-while");
		int numbers = 86562;
		int newNums = 0;
		 do {
			int digits = numbers % 10;
			newNums = newNums * 10 + digits;
			numbers = numbers / 10;
		}while (numbers > 0);
		System.out.println(newNums);
		
		System.out.println("\n");
		System.out.println("using for loop");
		
	}

}
