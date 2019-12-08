package PrimitiveUnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorSq {
	
public static void main(String[] args) {
	
	IntUnaryOperator opr = i-> i*i;
	
	System.out.println(opr.applyAsInt(12));
}

}

/**
 * Other primitive version of unaryoperator are
 * 1. LongUnaryOperator
 * 2. DoubleUnaryOperator
 * 3. IntUranaryOperator
 */
