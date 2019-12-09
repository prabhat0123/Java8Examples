package Stream;

import java.util.stream.Stream;

public class StreamOfMethod {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(9, 99, 999, 9999);
		s.forEach(System.out::println);

		Integer[] intArray = { 1, 22, 21, 32, 1212, 34, 5, 2 };
		Stream<Integer> s2 = Stream.of(intArray);
		s2.forEach(System.out::println);
		
	}

}
