package PrimitivePredicate;

import java.util.function.IntPredicate;

public class IntPredicateEvenNumCheck {

	public static void main(String[] args) {
		IntPredicate isEven = x-> x%2==0;
		
		System.out.println(isEven.test(12));

	}
	
	/**
	 * Type of premitive type Predicate
	 * 1. IntPrediate
	 * 2. LongPredicate
	 */

}
