package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEvenNumToList {
	
	public static void main(String[] args) {
		List<Integer> actualList = Arrays.asList(new Integer [] {0,5,10,15,20,25});
		System.out.println(actualList);
		List<Integer> evenList = actualList.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
	}

}
