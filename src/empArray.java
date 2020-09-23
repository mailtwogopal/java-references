import java.util.Arrays;

public class empArray {

	public static void main(String[] args) {
		// employee array
		int[] empId = {1,2,3,4,5};
		String[] empName = {"emp1", "emp2", "emp3", "emp4", "emp5"};
		double[] empSalary = {40000, 55000, 42000, 38000, 50000};
		display(empId, empName, empSalary);
		display(empId, empName);
		display("emp5", empId, empName, empSalary);
	}
	
	public static void display(int[] id, String[] name, double[] salary) {
		int i;
		System.out.println("emp ID " + "emp Name " + "emp Salary");
		for (i=0; i < 5; i++) {
			System.out.println(id[i] + "       " + name[i] + "       " + salary[i]);
		}
	}
	
	public static void display(int[] id, String[] name) {
		int i;
		System.out.println("emp ID " + "emp Name ");
		for (i=0; i < 5; i++) {
			System.out.println(id[i] + "       " + name[i] );
		}
	}
	
	public static void display(String searchFor, int[] id, String[] name, double[] salary) {
		int searchIndex;
		searchIndex = Arrays.asList(name).indexOf(searchFor);
		System.out.println("emp ID " + "emp Name " + "emp Salary");
		System.out.println(id[searchIndex] + "       " + name[searchIndex] + "       " + salary[searchIndex]);
	}

}
