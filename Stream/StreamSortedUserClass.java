package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedUserClass {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Prabhat", 18900));
		employeeList.add(new Employee("Ajay", 34500));
		employeeList.add(new Employee("Vinay", 35000));
		employeeList.add(new Employee("Sunil", 18000));
		employeeList.add(new Employee("Rahul", 27000));
		employeeList.add(new Employee("Rajeec", 34300));
		
		System.out.println(employeeList);

		List<Employee> sortedList = employeeList.stream()
				.sorted((o1, o2) -> (o1.salary > o2.salary ? -1 : (o2.salary > o1.salary ? 1 : 0)))
				.collect(Collectors.toList());
		System.out.println(sortedList);
		List<Employee> sortedList2 = employeeList.stream()
				.sorted((o1,o2)->o1.name.compareTo(o2.name))
				.collect(Collectors.toList());
		
		System.out.println(sortedList2);
	}

}

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
