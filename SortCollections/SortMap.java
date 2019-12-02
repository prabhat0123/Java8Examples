package SortCollections;

import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	// Tree map can be sortd by key
	// implmentation of compatre method "(o1, o2) -> (o1.name.length() >
	// o2.name.length()) ? 1 : (o2.name.length() > o1.name.length()) ? -1 : 0"

	public static void main(String[] args) {
		Map<EmpMap, Integer> employees = new TreeMap<>(
				(o1, o2) -> (o1.name.length() > o2.name.length()) ? 1 : (o2.name.length() > o1.name.length()) ? -1 : 0);

		employees.put(new EmpMap(1, "Peekay"), 1);
		employees.put(new EmpMap(2, "Ajay"), 2);
		employees.put(new EmpMap(3, "Bin"), 3);
		employees.put(new EmpMap(4, "Sunil"), 4);
		employees.put(new EmpMap(5, "Ananana"), 5);

		System.out.println(employees);

	}

}

class EmpMap {

	public int id;
	public String name;

	public EmpMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}
