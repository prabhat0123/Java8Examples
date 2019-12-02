package SortCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// sort by name length
public class SortList {

	public static void main(String[] args) {

		List<EmpList> employees = new ArrayList<>();
		employees.add(new EmpList(1, "Peekay"));
		employees.add(new EmpList(2, "Ajay"));
		employees.add(new EmpList(3, "Bin"));
		employees.add(new EmpList(4, "Sunil"));
		employees.add(new EmpList(5, "Ananana"));
		System.out.println(employees);
		System.out.println("-------XXXX-----");

		Collections.sort(employees, (o1,
				o2) -> (o1.name.length() > o2.name.length()) ? 1 : (o2.name.length() > o1.name.length()) ? -1 : 0);
	System.out.println(employees);
	}

}

class EmpList {

	public int id;
	public String name;

	public EmpList(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	

}