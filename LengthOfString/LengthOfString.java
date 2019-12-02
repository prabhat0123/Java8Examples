package LengthOfString;

public class LengthOfString {

	public static void main(String[] args) {
		
		Interf i = s -> s.length();
		System.out.println("Length of Hello  " +i.len("Hello"));
	}
}

@FunctionalInterface
interface Interf {
	int len(String s);
}
