package PrimitiveBinaryOperator;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSumNums {
	
	public static void main(String[] args) {
		IntBinaryOperator opr = (i1,i2) -> i1+i2;
		System.out.println(opr.applyAsInt(12, 23));
	}

}
