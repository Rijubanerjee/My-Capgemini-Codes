package Lab2;

import java.util.Scanner;

public class Exercise3 {
	static int[] reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		return b;
	}

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array:");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		b = reverse(a, a.length);
		for (int j = 0; j < 10; j++)
			System.out.println(b[j]);
		sc.close();
	}

}
