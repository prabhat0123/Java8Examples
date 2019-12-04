package Functions;

import java.util.function.Function;

public class FunctionStaticMethod {

	public static void main(String[] args) {
		Function<String, String> func = Function.identity();

		String s = func.apply("PRABHAT");
		System.out.println(s);
	}

}
