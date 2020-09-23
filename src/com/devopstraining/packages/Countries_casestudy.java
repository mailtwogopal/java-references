package com.devopstraining.packages;

import java.util.ArrayList;
import java.util.Collections;

public class Countries_casestudy {

	public static void main(String[] args) {
		ArrayList<String> Countries = new ArrayList<String>();
		Countries.add("Brazil");
		Countries.add("Australia");
		Countries.add("India");
		Countries.add("USA");
		Countries.add("Switzerland");
		Countries.add("Argentina");
		Countries.add("Sweden");
		Countries.add("Poland");
		for(String counter: Countries) {
			System.out.println(counter);
		}
		System.out.println("\n");
		System.out.println("after sorting");
		Collections.sort(Countries);
		for(String counter: Countries) {
			System.out.println(counter);
		}
	}

}
