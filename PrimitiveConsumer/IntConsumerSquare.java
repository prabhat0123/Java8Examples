package PrimitiveConsumer;

import java.util.function.IntConsumer;

public class IntConsumerSquare {
	
	public static void main(String[] args) {
		
		IntConsumer cons = i -> System.out.println(i*i);
		cons.accept(10);
	}

}
