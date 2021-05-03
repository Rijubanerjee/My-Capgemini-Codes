package Lab1;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Prime numbers till:");
		int n = sc.nextInt();
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println(primeNumbers);
	}

}
