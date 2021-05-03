package Day2;

import java.util.Scanner;

public class array {
	public static void main(String[] args) 
	{
		array app= new array();
		int arr[]=new int[10];
		int arr1[]=new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Insert array:");
			int x= sc.nextInt();
			arr = app.insertarr(arr,x,i);
		}
		app.printarr(arr);
		
		arr1 = app.sort(arr);
		System.out.println("The array without repetation:");
		app.printarr(arr1);
	}

	
	public int[] insertarr(int arr[],int information,int position)
	{
		arr[position]=information;
		return arr;
	}
	
	public void printarr(int arr[])
	{
		for (int j : arr) 
		{
			if (j!=0)
				System.out.print(" "+j);
			
		}
	}
	public int[] sort(int arr[])
	{
		int[] arr1  = new int[arr.length];
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {    
			boolean flag = false;
	        for(int j = i + 1; j < arr.length; j++) {    
	            if(arr[i] == arr[j] & i != j)
	            	{
	            		flag=true;
	            		break;
	            	}
	           }
	        if(!flag)
			{
				arr1 [temp] = arr[i];
				temp++;
			}
	    } 
		return arr1;
	}

}