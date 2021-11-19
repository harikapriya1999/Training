package Practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class Solutions {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("102", "John", 2, "active", "40000"));
		emp.add(new Employee("156", "Jai", 5, "active", "40000"));
		emp.add(new Employee("134", "mohan", 1, "inactive", "80000"));
		emp.add(new Employee("137", "Hari", 3, "active", "55000"));
		emp.add(new Employee("101", "smith", 7, "active", "30000"));
		emp.add(new Employee("121", "Sam", 2, "inactive", "45000"));
		emp.add(new Employee("201", "Kiran", 3, "inactive", "25000"));
		emp.add(new Employee("185", "Tony", 7, "active", "65000"));
		emp.add(new Employee("145", "Steve", 1, "active", "20000"));
		emp.add(new Employee("225", "Harry", 3, "active", "7000"));
		emp.add(new Employee("109", "kiya", 2, "active", "35000"));
		emp.add(new Employee("501", "sri", 2, "active", "50000"));
		Map<Integer, List<Employee>> deptList = emp.stream().collect(Collectors.groupingBy(Employee::getDeptId));
		Set<Entry<Integer, List<Employee>>> set = deptList.entrySet();

		// QA : Write a program to print employee details in each department

		for (Entry<Integer, List<Employee>> entry : set) {
			System.out.println("\nEmployees in department " + entry.getKey());
			for (Employee employee : entry.getValue()) {
				System.out.println("\n" + employee + "\n");
			}
		}
		System.out.println("\n*****************************************************************");

		// QB : Write a program to print employees count working in each department
		for (Entry<Integer, List<Employee>> entry : set) {
			System.out.print("\nnumber of employees in department " + entry.getKey() + " = ");
			long count = emp.stream().filter(empOne -> empOne.getDeptId() == entry.getKey()).count();
			System.out.println(count);

		}
		System.out.println("\n*****************************************************************");

		// QC : Write a program to print active and inactive employees in the given
		// collection

		System.out.println("\nActive Employees are:\n");
		emp.stream().filter(empOne -> empOne.getStatus().equals("active")).forEach(p -> System.out
				.println(p.getEmpName() + " [empId= " + p.getEmpId() + ", deptId= " + p.getDeptId() + "]\n"));
		System.out.println("\nInactive Employees are:\n");
		emp.stream().filter(empOne -> empOne.getStatus().equals("inactive")).forEach(p -> System.out
				.println(p.getEmpName() + " [empId= " + p.getEmpId() + ", deptId= " + p.getDeptId() + "]\n"));
		System.out.println("\n*****************************************************************");

		// QD : Write a program to print Max/Min Salary from the given collection

		Integer max = emp.stream().mapToInt(p -> Integer.parseInt(p.getSalary())).max()
				.orElseThrow(NoSuchElementException::new);
		System.out.println("\nMaximum salary is : " + max);
		Integer min = emp.stream().mapToInt(p -> Integer.parseInt(p.getSalary())).min()
				.orElseThrow(NoSuchElementException::new);
		System.out.println("\nMinimum salary is : " + min);
		System.out.println("\n*****************************************************************");

		// QE : Write a program to print the max salary of an employee from each
		// department

		for (Entry<Integer, List<Employee>> entry : set) {
			System.out.print("\nMaximum salary in department " + entry.getKey() + " = ");
			Integer deptMax = emp.stream().filter(empOne -> empOne.getDeptId() == entry.getKey())
					.mapToInt(p -> Integer.parseInt(p.getSalary())).max().orElseThrow(NoSuchElementException::new);
			System.out.println(deptMax);
		}
	}
}
