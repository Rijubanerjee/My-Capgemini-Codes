package Lab1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth term:");
		n = sc.nextInt();
		System.out.println(calculateDifference(n));
	}
	
	static int calculateDifference (int n)
	{
		int sum1=0;
		int sum2=0;
		for(int i = 0; i <= n; i++)
		{
			sum1=sum1+i;
			sum2=sum2+ square(i);
		}
		sum1 = square(sum1);
		return sum1+sum2;
	}
	static int square (int n)
	{
		return n*n;
	}

}
