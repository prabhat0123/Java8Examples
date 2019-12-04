package Predicate;

import java.util.function.Predicate;

public class PredicateNumberGreaterThan10 {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;

		System.out.println(p.test(10));
	}

}

/*
 * interface Predicate<T>{ public boolean test(T t); }
 */