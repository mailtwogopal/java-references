package com.devopstraining.packages;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Students_record {

	public static void main(String[] args) {
		HashMap <Integer, String> studentsRecord = new HashMap<Integer, String>();
		studentsRecord.put(001, "java");
		studentsRecord.put(002, "python");
		studentsRecord.put(003, "javascript");
		studentsRecord.put(004, "c#");
		studentsRecord.put(005, "R");
		System.out.println("before deletion the map has " + studentsRecord);
		studentsRecord.remove(004);
		studentsRecord.remove(002);
		System.out.println("after deletion the map has " + studentsRecord);
		studentsRecord.replace(003, "nodejs");
		studentsRecord.replace(005, "reactjs");
		
	}

}
