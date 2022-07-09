package numberSystem;

public class DecimalToBinary {

	public static void main(String[] args) {
		int dec = 37;
		int multiplier = 1; // initial value with which we are multiplying remainder
		int bin = 0; // binary no
		while (dec > 0) {
			int rem = dec % 2;
			int value = multiplier * rem;
			bin = bin + value;
			dec = dec / 2; // as destination base is 2
			multiplier = multiplier * 10; // updating value of multiplier

		}
		System.out.println(bin);
	}

}
