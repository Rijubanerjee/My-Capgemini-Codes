package AssignmentDay4;

import java.util.Scanner;

public class patternodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanf or cin
		int choice = 0;
		do {
			System.out.println(" Enter rows :- ");

			int row = sc.nextInt();

			int even = 2;
			int odd = 1;

			for (int i = 1; i <= row; i++) {
				if (i % 2 == 0) {
					for (int j = i; j > 0; j--) {
						System.out.print(even + " ");
						even += 2;
					}
				} else {
					for (int j = i; j > 0; j--) {
						System.out.print(odd + " ");
						odd += 2;
					}
				}

				System.out.println("\n");
			}

			System.out.println(" Do u want to exe more <0 for exit>");
			choice = sc.nextInt();
		} while (choice != 0);

	}

}
