package SortCollections;

import java.util.Set;
import java.util.TreeSet;

public class SortSet {

	public static void main(String[] args) {

		Set<EmpSet> employees = new TreeSet<>(
				(o1, o2) -> (o1.name.length() > o2.name.length()) ? 1 : (o2.name.length() > o1.name.length()) ? -1 : 0);

		employees.add(new EmpSet(1, "Peekay"));
		employees.add(new EmpSet(2, "Ajay"));
		employees.add(new EmpSet(3, "Bin"));
		employees.add(new EmpSet(4, "Sunil"));
		employees.add(new EmpSet(5, "Ananana"));

		System.out.println(employees);
	}

}

class EmpSet {

	public int id;
	public String name;

	public EmpSet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}
