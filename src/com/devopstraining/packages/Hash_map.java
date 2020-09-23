package com.devopstraining.packages;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,  "john");
		map.put(2, "peter");
		map.put(3, "yes");
		map.put(4, "no");
		map.put(5, "java");
		System.out.println(map);
	}

}
