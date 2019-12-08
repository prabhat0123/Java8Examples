package BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateNumCheck {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> checkEvenSum = (a,b) -> (a+b)%2==0;

		System.out.println(checkEvenSum.test(12, 32));
		System.out.println(checkEvenSum.test(12, 33));

	}

}
