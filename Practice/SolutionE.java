package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SolutionE {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
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
        emp.add(new Employee("501","sri",2,"active","50000")); 
		Map<Integer, List<Employee>> deptList = emp.stream().collect(Collectors.groupingBy(Employee::getDeptId));
		Set<Entry<Integer, List<Employee>>> set = deptList.entrySet();

		for (Entry<Integer, List<Employee>> entry : set) {
			System.out.print("\nMaximum salary in department " + entry.getKey() + " = ");
			Integer max = emp.stream().filter(empOne -> empOne.getDeptId() == entry.getKey())
					.mapToInt(p -> Integer.parseInt(p.getSalary())).max().orElseThrow(NoSuchElementException::new);
			System.out.println(max);
		}

	}

}
