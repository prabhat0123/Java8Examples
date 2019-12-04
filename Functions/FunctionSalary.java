package Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionSalary {

	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<>();

		employees.add(new Employees("Prabhat", 1000));
		employees.add(new Employees("Ajay", 2000));
		employees.add(new Employees("Kunal", 3000));
		employees.add(new Employees("Mrinal", 7000));

		System.out.println("Before Increment : " + employees);

		Function<List<Employees>, List<Employees>> func = empl -> {

			Predicate<Employees> predict = emp -> emp.salary < 3000;

			for (Employees emp : empl) {
				if (predict.test(emp)) {
					emp.salary = emp.salary + 455;
				}
			}
			return empl;

		};

		System.out.println("After Increment : " + func.apply(employees));

	}

}

class Employees {
	public String name;
	public int salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}