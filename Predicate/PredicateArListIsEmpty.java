package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArListIsEmpty {

	public static void main(String[] args) {
		
		List<String> strList= Arrays.asList("abc","def");
		List<String> strListEmp=new ArrayList<>();
		
		Predicate<List> p = s -> s.isEmpty();

		System.out.println(p.test(strList));
		System.out.println(p.test(strListEmp));
	}

}

/*
 * interface Predicate<T>{ public boolean test(T t); }
 */