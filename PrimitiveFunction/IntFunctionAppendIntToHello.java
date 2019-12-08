package PrimitiveFunction;

import java.util.function.IntFunction;

public class IntFunctionAppendIntToHello {

	public static void main(String[] args) {
		
		IntFunction<String>sqFunc = i -> "Hello-"+i;
		System.out.println(sqFunc.apply(10));

	}

}
