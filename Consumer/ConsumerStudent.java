package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerStudent {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Prabhat",100));
		students.add(new Student("AJAY",80));
		students.add(new Student("Anil",75));
		students.add(new Student("Kunal",30));
		students.add(new Student("King",34));
		
		
		Predicate<Integer> predicat = i-> i>=60;
		
		Function<Integer,String> function = mark -> {
			if(mark>=90) return "GRADE: A";
			else if(mark>=80) return "GRADE: B";
			else if(mark>=70) return "GRADE: C";
			else if(mark>=50) return "GRADE: D";
			else if(mark>=40) return "GRADE: E";
			else return "GRADE: FAIL";
		};
		
		Consumer<Student> con = student-> {
			
			if(predicat.test(student.mark)) {
				System.out.println("----------");
			System.out.println("Student name : "+student.name);
			System.out.println("Student mark : "+student.mark);
			System.out.println("Student Grade : "+function.apply(student.mark));
			}
			
		};
		
		for(Student student : students) {
			con.accept(student);
		}
		
		
	}

}


class Student{
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
}
