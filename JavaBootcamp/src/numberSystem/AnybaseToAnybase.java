package numberSystem;

public class AnybaseToAnybase {

	public static void main(String[] args) {
		// Anybase To Anybase
		// Part 1 anyBase to Decimal Conversion
		int src = 8;
		int dst = 2;
		int num = 33;

		// Step 1 : Convert base 8 number to base 10(decimal)

		int decimal = 0;
		int multiplier = 1;
		while (num > 0) {
			int rem = num % 10; // divide by destn base i.e. 10
			num = num / 10;

			// Step 2 : Multiplying with power of src base = 8
			int value = rem * multiplier;
			multiplier = multiplier * 8;

			// Step 3 : Adding the values
			decimal = decimal + value;

		}
		System.out.println(decimal);
		
		// Part 2 Decimal to anyBase Conversion
		int binary = 0;
		multiplier = 1;
		while (decimal > 0) {
			// Step 1 : division by destn base i.e. 2
			int rem = decimal % 2;
			decimal = decimal / 2;

			// Step 2 : multiplication by power of src base i.e. 10
			int value = rem * multiplier;
			multiplier = multiplier * 10;

			// Step 3 : Adding the values
			binary = binary + value;

		}
		System.out.println(binary);

	}

}
