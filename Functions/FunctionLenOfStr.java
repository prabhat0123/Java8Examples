package Functions;

import java.util.function.Function;

public class FunctionLenOfStr {
	
	public static void main(String[] args) {
		Function<String,Integer> f = str -> str.length();
		System.out.println(f.apply("Hello World"));
	}

}


/*
 * interface Function<T,R>{ R apply(T t); }
 */