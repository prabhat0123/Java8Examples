package StaticMethod;

 interface InterfaceOne {
	 
	 public static void m1() {
		 System.out.println("It is from static method");
	 }

}

 public class StaticMethods implements InterfaceOne{
	  
	 public static void main(String[] args) {
		 StaticMethods s = new StaticMethods();
		 // s.m1();
		// StaticMethods.m1()
		 InterfaceOne.m1();
	}
 }