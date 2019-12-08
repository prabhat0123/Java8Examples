package PrimitiveConsumer;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerSalIncr {
	public static void main(String[] args) {
		
		Employee employee = new Employee("ABC",8900);

		System.out.println(employee);
		ObjIntConsumer<Employee> incSal= (emp,inc) -> emp.salary=emp.salary+inc;
		incSal.accept(employee, 230);
		System.out.println(employee);
		
	}

}


class Employee{
	String name;
	int salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}
