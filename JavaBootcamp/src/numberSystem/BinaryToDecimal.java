package numberSystem;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int bin = 100101;
		int multiplier = 1; // initial value with which we are multiplying remainder
		int dec = 0; // decimal no
		while (bin > 0) {
			int rem = bin % 10;
			int value = multiplier * rem;
			dec = dec + value;
			bin = bin / 10; // as destination base is 10
			multiplier = multiplier * 2 ; // updating value of multiplier

		}
		System.out.println(dec);
	}

}
