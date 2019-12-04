package Functions;

import java.util.function.Function;

public class FunctionReplaceSpaceStr {
	
	
	public static void main(String[] args) {
		Function<String,String> func = str->str.replace(" ","");
		System.out.println(func.apply("HELLO WORLDS"));
	}

}
