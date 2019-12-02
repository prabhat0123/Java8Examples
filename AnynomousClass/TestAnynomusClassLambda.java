package AnynomousClass;

public class TestAnynomusClassLambda {

	int x = 8000;

	public void m2() {
		Inter i = () -> {
			int x = 9000;
			System.out.println(this.x);
			System.out.println(x);

		};

		i.m1();

	}

	public static void main(String[] args) {
		TestAnynomusClassLambda test = new TestAnynomusClassLambda();

		test.m2();
	}

}

interface Interf {
	void m1();
}