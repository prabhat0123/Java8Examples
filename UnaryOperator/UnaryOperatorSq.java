package UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSq {

	public static void main(String[] args) {
		UnaryOperator<Integer> uopr = i -> i*i;
		System.out.println(uopr.apply(13));
	}

}
