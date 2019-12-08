package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierSystemDate {

	public static void main(String[] args) {
		Supplier<Date> sup = () -> new Date();

		System.out.println(sup.get());

	}

}

/*
 * interface Supplie<R>{ R get(); }
 */