package P1;

import java.util.Scanner;

public class Date {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter date");
			int date= sc.nextInt();
			if (date > 31 || date ==0)
			{
				System.out.println("Wrong input");
			}
			
			else {
				if (date > 10 && date < 21)
					System.out.println(date+"th");
				else if (date%10==1)
					System.out.println(date+"st");
				else if (date%10==2)
					System.out.println(date+"nd");
				else if(date%10==3)
					System.out.println(date+"rd");
				else 
					System.out.println(date+"th");
			}
			
		}
}
