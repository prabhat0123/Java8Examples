package Predicate;

import java.util.function.Predicate;

public class PredicateNameStartWithK {

	public static void main(String[] args) {
		String[] names = { "ABC", "KLM", "KJM", "TMN" };
		PredicateNameStartWithK obj = new PredicateNameStartWithK();
		obj.test(names);

	}

	public void test(String[] names) {
		Predicate<String> p = str -> str.startsWith("K");
		for (int i = 0; i < names.length; i++) {
			if (p.test(names[i]))
				System.out.println(names[i]);
		}
	}

}

/*
 * interface Predicate<T>{ public boolean test(T t); 
 * 
 * }
 */