package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRemoveNullOrEmpty {

	public static void main(String[] args) {

		String[] names = { "ABC", "", null, "TMN" };
		PredicateRemoveNullOrEmpty obj = new PredicateRemoveNullOrEmpty();

		for (String str : obj.removeNullOrEmpty(names))
			System.out.println(str);

	}

	public String[] removeNullOrEmpty(String[] names) {

		Predicate<String> isNotNullorEmpty = name -> name != null && name.length() != 0;

		List<String> retunList = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			if (isNotNullorEmpty.test(names[i]))
				retunList.add(names[i]);
		}

		return retunList.toArray(new String[retunList.size()]);

	}
}
