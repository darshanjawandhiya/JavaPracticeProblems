package basicPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}
			nsp--;
			nst += 2;
			System.out.println();
			row++;
		}

	}

}
