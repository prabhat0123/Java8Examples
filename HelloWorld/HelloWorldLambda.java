package HelloWorld;

public class HelloWorldLambda {

	public static void main(String[] args) {

		inter i = () -> System.out.println("Hello world");
		i.m1();
	}

}
@FunctionalInterface
interface inter {
	public void m1();
}