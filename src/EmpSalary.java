import java.util.Scanner;

class EmployeeWorking
{
	void working() {
		System.out.println("Work from parent class");
	}
	double earn() {
		return 0;
		
		
	}
}

class developer extends EmployeeWorking
{
	double earn() {
		return 95000;
		
	}
void working() {
		System.out.println("Work from dev class");
	}
}

class tester extends EmployeeWorking
{
	double earn() {
		return 85000.00;
	}
	
	void working() {
		System.out.println("Work from tester class");
	}
}

public class EmpSalary {

	public static void main(String[] args) {
		EmployeeWorking emp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose employee type to know work & salary information");
		String empType = sc.nextLine();
		System.out.println("You opted to know salary of " + empType);
		if (empType.equalsIgnoreCase("dev")){
			emp = new developer();
			emp.working();
			System.out.println(emp.earn());
		}
		else {
			emp = new tester();
			emp.working();
			System.out.println(emp.earn());
		}
	
	}

}
