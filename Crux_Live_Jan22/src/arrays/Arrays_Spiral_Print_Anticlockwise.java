package arrays;

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col]; // new 2-d arr created in heap

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt(); // taking input of element in arr
			}
		}
		SpiralPrint(arr); // calling func

	}

	private static void SpiralPrint(int arr[][]) {
		// TODO Auto-generated method stub
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int total=arr.length*arr[0].length; //row*col
		int count=0; //intial val of counter
		
		while(count<total) { //base condn
			
			for (int i = minr; i <=maxr; i++) {
				System.out.print(arr[i][minc]+ ", ");
				count++;
			}
			minc++;
			
			for (int i = minc; i <=maxc; i++) {
				System.out.print(arr[maxr][i]+ ", ");
				count++;
			}
			maxr--;
			
			for (int i =maxr; i>=minr; i--) {
				System.out.print(arr[i][maxc]+ ", ");
				count++;
			}
			maxc--;
			
			for (int i =maxc; i>=minc; i--) {
				System.out.print(arr[minr][i]+ ", ");
				count++;
			}
			minr++; //imp
		}
		System.out.print("END");
		
	}

}
