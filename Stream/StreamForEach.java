package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(new Integer [] {1,22,21,32,1212,34,5,2});
		System.out.println(numList);
		numList.stream().forEach(System.out::println);
		
		
	}
	

}
