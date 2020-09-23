package com.devopstraining.packages;

import java.io.IOException;
import java.util.Scanner;

interface HrTeam
{
	public void hireEmployee();
}

class HR
{
	public void hireEmployee() {
		System.out.println("from hr class");
	}
}

class Tech
{
	public void hireEmployee() {
		System.out.println("from tech class");
	}
}

class Product
{
	public void hireEmployee() {
		System.out.println("from product class");
	}
}

public class Recruiting_casestudy {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String deptToApply = sc.nextLine();
		int marks = sc.nextInt();
		
		if (marks > 71) {
			switch(deptToApply) {	
			case "HR":
				HR hr = new HR();
				hr.hireEmployee();
				break;
			case "Tech":
				Tech tech = new Tech();
				tech.hireEmployee();
				break;
			case "Product":
				Product prd = new Product();
				prd.hireEmployee();
				break;
			}
			
		}
		else {
			throw new IOException("Candidate not eligible");
		}
	}

}
