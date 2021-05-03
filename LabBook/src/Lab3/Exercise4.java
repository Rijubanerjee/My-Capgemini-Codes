package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str;

		System.out.println("Enter the number:");
		str = scan.nextLine();

		System.out.println(modifyNumber(str));
		scan.close();

	}

	public static String modifyNumber(String str) {

		int[] arr1 = new int[str.length()];
		int[] arr2 = new int[str.length()];
		int prev = 0;
		for (int i = 0; i < str.length(); i++) {

			arr1[i] = str.charAt(i) - '0';

		}
		int position = arr1.length - 1;
		for (int i = 0; i < arr1.length; i++) {

			int diff = arr1[i] - prev;
			arr2[position] = (int) Math.abs(diff);
			prev = arr1[i];
			position--;
		}
		String str1 = new String();
		str1 = Arrays.toString(arr2);
		return str1;

	}

}
