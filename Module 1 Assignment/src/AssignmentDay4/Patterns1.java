package AssignmentDay4;

import java.util.Scanner;

public class Patterns1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanf or cin 
		int choice = 0;
		do
		{
			System.out.println(" Enter rows :- ");
			
			int row = sc.nextInt();
			
			int num = 1;
			
			for (int i = 1; i <= row; i++)
			{
				for (int j=i; j > 0; j--)
				{
					System.out.print(num+" ");
					num ++;
				}
				System.out.println("\n");
			}
			
			System.out.println(" Do u want to exe more <0 for exit>");
			choice = sc.nextInt();
		}while(choice!=0);
		
	}

}
