package Lab2;

import java.util.Scanner;

public class Exercise1 {
	 public static int getSecondSmallest(int[] a){  
		int temp;
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
		int a[]= new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array:");
		for (int i = 0; i < 10; i++)
		{
			a[i] = sc.nextInt();		
		}
		System.out.println("Second smallest: "+getSecondSmallest(a)); 
		sc.close();
		}
}
