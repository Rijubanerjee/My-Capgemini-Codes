package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args)

	{

		int n;
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of strings you want to enter:");

		n = s.nextInt();

		String names[] = new String[n];

		System.out.println("Enter all the alphabets:");

		for (int i = 0; i < n; i++)

		{						
			names[i] =  s.nextLine();	
		}

		
		sortStrings(names);
		System.out.println("Output:");
		for(int i = 0; i < n; i++) {
			System.out.print(names[i] + " ");
		}
		s.close();
	}
	
	public static String[] sortStrings(String arr[]) {
		Arrays.sort(arr);
		String s1, s2;
		int mid;
		for(int i = 0; i < arr.length; i++) {
			mid = (int) Math.ceil(arr[i].length()/2.0);
			s1 = (arr[i].substring(0,mid)).toUpperCase();
			s2 = (arr[i].substring(mid,arr[i].length())).toLowerCase();
			arr[i] = s1 + s2;
		}
		return arr;
	}
}