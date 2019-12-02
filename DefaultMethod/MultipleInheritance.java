package DefaultMethod;

public class MultipleInheritance implements InterfaceOne, InterfaceTwo {
	
	public void m1() {
		InterfaceOne.super.m1();
		InterfaceTwo.super.m1();
	}
	public static void main(String[] args) {
		MultipleInheritance u = new MultipleInheritance();
		u.m1();
	}

}
