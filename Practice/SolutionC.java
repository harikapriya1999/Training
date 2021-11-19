package Practice;

import java.util.ArrayList;

public class SolutionC {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("102", "John", 2, "active", "40000"));
		emp.add(new Employee("107", "Peter", 1, "inactive", "80000"));
		emp.add(new Employee("197", "Harrold", 3, "active", "55000"));
		emp.add(new Employee("101", "Tom", 7, "active", "30000"));
		emp.add(new Employee("121", "Smith", 2, "inactive", "45000"));
		emp.add(new Employee("201", "Kane", 3, "inactive", "25000"));
		emp.add(new Employee("185", "Tony", 7, "active", "65000"));
		emp.add(new Employee("145", "Steve", 1, "active", "20000"));
		emp.add(new Employee("225", "Harry", 3, "active", "7000"));
		emp.add(new Employee("109", "Will", 2, "active", "35000"));

		System.out.println("\nActive Employees are:");
		emp.stream().filter(empOne -> empOne.getStatus().equals("active"))
				.forEach(p -> System.out.println(p.getEmpName()));

		System.out.println("\nInactive Employees are:");
		emp.stream().filter(empOne -> empOne.getStatus().equals("inactive"))
				.forEach(p -> System.out.println(p.getEmpName()));

	}

}
