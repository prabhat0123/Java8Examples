package BiFunction;

import java.util.function.BiFunction;

public class BiFunctionCreateObject {
	
	public static void main(String[] args) {
		
		BiFunction<String,Integer,Student> studentObj = (name,roll)-> new Student(name,roll);
		System.out.println(studentObj.apply("Prtabhat",1));
		System.out.println(studentObj.apply("ajay",22));
		System.out.println(studentObj.apply("ramany",3));
		System.out.println(studentObj.apply("vinay",4));
	}

}
class Student{
	String name;
	int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
}