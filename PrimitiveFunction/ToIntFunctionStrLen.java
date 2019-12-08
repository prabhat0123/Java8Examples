package PrimitiveFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionStrLen {
	
	public static void main(String[] args) {
		ToIntFunction<String> strLen = s -> s.length();
		
		System.out.println(strLen.applyAsInt("YEst"));
	}
	
	/**
	 * Other versions of primitive function are
	 * 1. ToIntFunction
	 * 2. ToDoubleFunction
	 * 3. ToLongFunction
	 * 4. IntToLongFunction
	 * 5. IntToDoubleFunction
	 * 6. LongToIntFunction
	 * 7. LongToDoubleFunction
	 * 8. DoubleToLongFunction
	 * 9. DoubleToIntFunction
	 * 10. IntFunction
	 * 11. DoubleFunction
	 * 12. LongFunction
	 * 13. IntBiFunction
	 * 14. DoubleBiFunction
	 * 15. LongBiFunction
	 */

}
