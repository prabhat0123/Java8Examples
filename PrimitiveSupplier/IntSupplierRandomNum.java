package PrimitiveSupplier;

import java.util.function.IntSupplier;

public class IntSupplierRandomNum {

	public static void main(String[] args) {
	IntSupplier sup = () ->(int)( Math.random()*10);
	System.out.println(sup.getAsInt());

	}
	
	/**
	 * Type of Suppliers
	 * 1. IntSupplier
	 * 2. DoubleSupplier
	 * 3. LongSupplier
	 * 4. BooleanSupplier
	 * 
	 */
	

}
