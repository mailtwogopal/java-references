package com.devopstraining.packages;
class tablesOf5 extends Thread 
{
	public void run() {
		int j;
	for (j = 1; j < 13; j++) {
		System.out.println("5 times of "+ j + " is " + j*5);
	}
	}
}

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tablesOf5 t5 = new tablesOf5();
		t5.start();
		System.out.println("main execution started");
		int i;
		for (i =0; i< 21; i++) {
			if(i % 2 == 0) {
			System.out.println("printing even numbers " + i);
			}
		}
	}

}
