package AssignmentDay4;

import java.util.Scanner;

public class patternstar2 {
	public static void main(String args[]) {
		int choice = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter rows :- ");
			int myrows = sc.nextInt();
			for (int m = 1; m <= myrows; m++) {
				for (int p = myrows - m; p >= 1; p--) {
					System.out.print(" ");
				}
				for (int n = 1; n <= (m * 2) - 1; n++) {
					if (n == 1 || n == (m * 2) - 1 || m == myrows)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();

			}

			System.out.println(" Do u want to exe more <0 for exit>");
			choice = sc.nextInt();
		} while (choice != 0);
	}
}