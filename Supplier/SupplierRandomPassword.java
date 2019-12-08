package Supplier;

import java.util.function.Supplier;

public class SupplierRandomPassword {

	public static void main(String[] args) {

		String symbols = "abcdefghijklmnopqrstuvwxyz@#$";
		Supplier<Integer> randomNumSup = () -> (int) (Math.random() * 10);
		Supplier<Character> randomChatSup = () -> symbols.charAt((int) (Math.random() * 29));
		Supplier<String> sup = () -> {

			String pwd = "";

			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0)
					pwd = pwd + randomChatSup.get();
				else
					pwd = pwd + randomNumSup.get();

			}

			return pwd;
		};

		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());

	}

}
