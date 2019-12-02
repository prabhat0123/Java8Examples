package AnynomousClass;

public class TestAnynomusClass {

	int x = 8000;

	public void m2() {
		Inter i = new Inter() {
			int x = 9000;

			@Override
			public void m1() {

				System.out.println(this.x);
				System.out.println(x);

			}
		};

		i.m1();

	}

	public static void main(String[] args) {
		TestAnynomusClass test = new TestAnynomusClass();

		test.m2();
	}

}

interface Inter {
	void m1();
}