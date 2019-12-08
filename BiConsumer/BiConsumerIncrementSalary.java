package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerIncrementSalary {

	public static void main(String[] args) {

		BiConsumer<Employee, Integer> incrementSal = (employee, inc) -> employee.salary = employee.salary + inc;

		Employee emp = new Employee("ABC", 4000);
		System.out.println(emp);
		incrementSal.accept(emp, 400);
		System.out.println(emp);
	}

}

class Employee {
	String name;
	Integer salary;

	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
