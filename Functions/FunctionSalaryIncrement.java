package Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionSalaryIncrement {
	
	public static void main(String[] args) {
		
	List<Employee> employees = new ArrayList<>();

	employees.add(new Employee("Prabhat",1000));
	employees.add(new Employee("Ajay",2000));
	employees.add(new Employee("Kunal",3000));
	employees.add(new Employee("Mrinal",7000));
	
	Function<List<Employee>,Integer> func = empl -> {
		Integer sum=0;
		for(Employee emp : empl) {
			sum=sum+emp.salary;
		}
		
		return sum;
	};
	
	System.out.println(func.apply(employees));
		
	}

}


class Employee{
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
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}