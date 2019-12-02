package SumOfAandB;

public class SumOfAandB {

	public static void main(String[] args) {

		Interf i = (a, b) -> System.out.println("The sum by Lambada is " + (a + b));
		i.sum(10, 20);

	}

}

@FunctionalInterface
interface Interf {
	void sum(int a, int b);
}
