package DefaultMethod;

public interface InterfaceTwo {

	default void m1() {
		System.out.println("Default of Interface2");
	}

}