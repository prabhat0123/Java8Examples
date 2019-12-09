package BinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorConCatStr {
	
	public static void main(String[] args) {
		BinaryOperator<String> bOpr = (str1,str2)-> str1+str2;
		System.out.println(bOpr.apply("Hello ", "World"));
	}
	
	

}
