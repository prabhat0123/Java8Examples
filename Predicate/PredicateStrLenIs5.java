package Predicate;

import java.util.function.Predicate;

public class PredicateStrLenIs5 {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length()== 5;

		System.out.println(p.test("Hello"));
		System.out.println(p.test("Hello World"));
	}

}

/*
 * interface Predicate<T>{ public boolean test(T t); }
 */