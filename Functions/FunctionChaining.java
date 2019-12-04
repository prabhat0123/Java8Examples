package Functions;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<Integer, Integer> func1 = i -> i * i;
		Function<Integer, Integer> func2 = i -> i * 2;

		System.out.println("Square and double result" + func1.andThen(func2).apply(3));
		System.out.println("Double and then Square" + func1.compose(func2).apply(3));

	}
}
