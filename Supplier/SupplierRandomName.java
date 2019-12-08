package Supplier;

import java.util.function.Supplier;

public class SupplierRandomName {

	public static void main(String[] args) {
		Supplier<String> sup = () -> {

			String[] names = { "ABC", "DEF", "GHI", "JKL" };
			int index = (int) (Math.random() * 4);

			System.out.println(index);
			return names[index];

		};

		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}

}
