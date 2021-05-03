package AssignmentDay4;

import java.util.Scanner;

public class patternstar1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);// scanf or cin
		int choice = 0;
		do {
			System.out.println(" Enter rows :- ");

			int row = sc.nextInt();

			for (int i = 0; i < row; i++) {

				for (int j = row - i; j > 1; j--) {

					System.out.print(" ");
				}

				for (int j = 0; j <= i; j++) {

					System.out.print("* ");
				}

				System.out.println();
			}
			System.out.println(" Do u want to exe more <0 for exit>");
			choice = sc.nextInt();
		} while (choice != 0);

	}
}
