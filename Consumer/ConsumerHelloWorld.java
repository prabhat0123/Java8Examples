package Consumer;

import java.util.function.Consumer;

public class ConsumerHelloWorld {
	
	public static void main(String[] args) {
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Hello World");
		
	}

}



//interface Consumer<T>{
//	void accept(T t);
//}