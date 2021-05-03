package Lab1;

import java.util.Scanner;

public class Exercise3 {
	static int n1 = 1, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {
		int n1 = 1, n2 = 1, n3, count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth position:");
		count = sc.nextInt();
		System.out.print(n1+" "+n2);
		printFibonacci(count-2);
		System.out.println("\n");
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}