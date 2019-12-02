package DefaultMethod;

public interface InterfaceOne {

	default void m1() {
		System.out.println("Default of Interface1");
	}

}