package Functions;

import java.util.function.Function;

public class FunctionNumSq {

	public static void main(String[] args) {
		Function<Integer, Integer> func = num -> num * num;
		System.out.println(func.apply(10));
	}

}
