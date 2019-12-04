package Predicate;

import java.util.function.Predicate;

public class PredicateChaining {

	public static void main(String[] args) {
		PredicateChaining obj = new PredicateChaining();

		int[] x = { 1, 2, 3, 4, 35, 60, 7, 11 };

		Predicate<Integer> p1 = s -> s > 10;
		Predicate<Integer> p2 = s -> s % 2 == 0;

		System.out.println("Numbers Greater than 10 : ");

		obj.testMethod(p1, x);

		System.out.println("Even Numbers : ");

		obj.testMethod(p2, x);

		System.out.println("Numbers Less than 10 : ");

		obj.testMethod(p1.negate(), x);

		System.out.println("Odd Numbers");

		obj.testMethod(p2.negate(), x);

		System.out.println("Greater Than 10 and even");

		obj.testMethod(p1.and(p2), x);

		System.out.println("Greater Than 10 or even");

		obj.testMethod(p1.or(p2), x);

	}

	public void testMethod(Predicate p, int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (p.test(x[i]))
				System.out.println(x[i]);
		}
	}

}

/*
 * interface Predicate<T>{ public boolean test(T t); }
 */