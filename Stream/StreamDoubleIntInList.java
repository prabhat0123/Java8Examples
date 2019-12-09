package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDoubleIntInList {
	
	public static void main(String[] args) {
		List<Integer> actualList = Arrays.asList(new Integer [] {0,5,10,15,20,25});
		System.out.println(actualList);
		List<Integer> evenList = actualList.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(evenList);
		
	}

}
