package Predicate;

import java.util.function.Predicate;

public class PredicateStaticMethod {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("PRABHAT");
		System.out.println(p.test("PRABHAT"));

		// For user-defined class in place of String,
		// You need to override equals method in user-defined class
	}

}
