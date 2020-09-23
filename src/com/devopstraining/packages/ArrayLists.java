package com.devopstraining.packages;
import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		int i;
		for(i=1; i<=10; i++) {
			AL.add(i);
		}
		System.out.println("size of arraylist is " + AL.size());
		for(int j: AL) {
			System.out.println(j);
		}
	}

}
