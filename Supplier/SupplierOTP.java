package Supplier;

import java.util.function.Supplier;

public class SupplierOTP {

	public static void main(String[] args) {
		Supplier <String> sup = () -> {
			String otp = "";
			for(int i=0;i<6;i++) {
				int random = (int)(Math.random()*10);
				otp=otp+random;
			}
			return otp;
		};

		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}
	
	
}
