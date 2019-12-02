package DefaultMethod;

public class OverrideDefaultOfOne implements InterfaceOne {
	
	public void m1() {
		System.out.println("Override Default of Interface1");
	}

	public static void main(String[] args) {
		OverrideDefaultOfOne u = new OverrideDefaultOfOne();
		u.m1();
	}

}
