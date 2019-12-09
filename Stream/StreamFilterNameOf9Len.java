package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterNameOf9Len {

	public static void main(String[] args) {

		List<String> nameList = Arrays
				.asList(new String[] { "1234", "123456", "123456789", "12345678910", "1234567891011" });
		System.out.println(nameList);

		List<String> names = nameList.stream().filter(name -> name.length() >= 9).collect(Collectors.toList());
		System.out.println(names);
	}

}
