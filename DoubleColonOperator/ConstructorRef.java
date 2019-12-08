package DoubleColonOperator;

public class ConstructorRef {

	public static void main(String[] args) {
		
		/** By Lambda operator
		 * ExpInterface expInt = () -> new Sample();
		 */
		
		ExpInterface expInt= Sample::new;
		expInt.get();

	}

}

class Sample{
	public Sample() {
		System.out.println("Object created of Sample");
	}
}


interface ExpInterface {
	public Sample get();
}