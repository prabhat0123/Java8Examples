package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountNumGreaterThan10 {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(new Integer [] {1,22,12,11,222,8,99,3,45,20,17,19});
		System.out.println(numList);
		List<Integer> numList20 = numList.stream().filter(i->i>20).collect(Collectors.toList());
		long i = numList.stream().filter(num->num>20).count();
		System.out.println(numList20);
		System.out.println("Count is : "+i);

	}

}
