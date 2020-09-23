package com.devopstraining.packages;
class thread1 extends Thread
{
	public void run() {
		int i;
		for(i=0; i<11; i++) {
			System.out.println("printing from thread1 " + i);
		}
	}
}

class thread2 extends Thread
{
	public void run() {
		int i;
		for(i=101; i<111; i++) {
			System.out.println("printing from thread2 " + i);
		}
	}
}
public class Multiplethreads_case_study {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		t1.start();
		thread2 t2 = new thread2();
		t2.start();
	}

}
