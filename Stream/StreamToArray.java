package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(new Integer[] { 1, 22, 21, 32, 1212, 34, 5, 2 });
		System.out.println(numList);

		Integer[] numArray = numList.stream().filter(i -> i > 20).toArray(Integer[]::new);

		for (Integer num : numArray)
			System.out.println(num);

	}

}
