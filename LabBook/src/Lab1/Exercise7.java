package Lab1;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		n = sc.nextInt();
		boolean ans = checkNumber(n);
		if (ans)
			System.out.println(n+"is an increasing number");
		else
			System.out.println(n+"is not an increasing number");
	}
	static boolean checkNumber (int n)
	{
		   if (n < 0)
		        n = -n;

		    int lastSeen = 10;
		    int current;

		    while (n > 0) {
		        current = n % 10;
		        if (lastSeen < current)
		            return false;
		        lastSeen = current;
		        n /= 10;
		    }
		    return true;
	}
}
