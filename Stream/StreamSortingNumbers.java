package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingNumbers {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(new Integer[] { 1, 22, 23, 34, 11, 12, 4, 7, 8, 99, 67, 2 });
		System.out.println(numList);

		List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);
	}

}
