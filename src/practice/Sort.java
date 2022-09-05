package practice;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] num = { -1, 2, -7, 19, 4, 6 };
		Arrays.sort(num);
		System.out.print("Ascending Order : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();
		System.out.print("Descending Order : ");
		for (int i = 5; i >= 0; i--) {
			System.out.print(" " + num[i]);
		}
	}
}
