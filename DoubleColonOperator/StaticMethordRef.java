package DoubleColonOperator;

public class StaticMethordRef {

	public static void main(String[] args) {

		Inter i = StaticMethordRef::m2;

		i.m1();
	}

	public static void m2() {
		System.out.println("Methord M2 is refered ");
	}

}

interface Inter {

	public void m1();

}
