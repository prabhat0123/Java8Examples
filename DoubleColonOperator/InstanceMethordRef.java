package DoubleColonOperator;

public class InstanceMethordRef {

	public static void main(String[] args) {

		InstanceMethordRef obj = new InstanceMethordRef();

		Inter2 i = obj::m2;

		i.m1();
	}

	public void m2() {
		System.out.println("Methord M2 is refered ");
	}

}

interface Inter2 {

	public void m1();

}
