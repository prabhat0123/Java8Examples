package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(new Integer [] {1,22,21,32,1212,34,5,2});
		System.out.println(numList);
		
		List<Integer> sortedList1 =numList.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("sortedList1 : "+sortedList1);
		
		Integer minnum1 =numList.stream().min((o1,o2)->o1.compareTo(o2)).get();
		System.out.println("min value sortedList1 : "+minnum1);
		
		Integer maxnum1 =numList.stream().max((o1,o2)->o1.compareTo(o2)).get();
		System.out.println("max value sortedList1 : "+maxnum1);
		
		List<Integer> sortedList2 =numList.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("sortedList2 : "+sortedList2);
		
		Integer minnum2 =numList.stream().min((o1,o2)->o2.compareTo(o1)).get();
		System.out.println("min value sortedList2 : "+minnum2);
		
		Integer maxnum2 =numList.stream().max((o1,o2)->o2.compareTo(o1)).get();
		System.out.println("max value  sortedList2 : "+maxnum2);
		
		
		
	}

}
