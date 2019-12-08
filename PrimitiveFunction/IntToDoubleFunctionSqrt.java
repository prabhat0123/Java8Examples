package PrimitiveFunction;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionSqrt {

	public static void main(String[] args) {
		IntToDoubleFunction func = i -> Math.sqrt(i);
		System.out.println(func.applyAsDouble(5));

	}

}
