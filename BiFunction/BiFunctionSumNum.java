package BiFunction;

import java.util.function.BiFunction;

public class BiFunctionSumNum {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> sumNumFunction = (a,b)-> a+b;

		System.out.println(sumNumFunction.apply(10, 2));
		System.out.println(sumNumFunction.apply(13, 2));
	}

}
