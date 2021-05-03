package Day2;

import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = new int [10];
		int arrmaxmin[] = new int [10];
		int arrmult[] = new int [10];
		ArrayExercise app = new ArrayExercise();
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Insert array element"+i);
			int x= sc.nextInt();
			arr = app.insertIntoArray(arr,x,i);
		}
		app.printArray(arr);
		System.out.println("enter element to search:");
		int a = sc.nextInt();
		
		int index = app.searchElement(arr, a);
		if (index == -1)
			System.out.println("Searched item not found");
		else if (index == -2)
			System.out.println("Empty array");
		else 
			System.out.println("The searched item "+a+" was found at index "+index);
		arrmaxmin = app.getMinMax(arr);
		app.printArray(arrmaxmin);
		System.out.println("Enter the number you want to find multiple of :");
		int m = sc.nextInt();
		arrmult = app.getMultiplesOf(arr,m);
		app.printArray(arrmult);
		
	}
	
	public void printUsingEnhanceForLoop(int arr[])
	{
		// from java 1.5 onwards
		for (int myElement : arr) {
			myElement = myElement/2; //business operation , 100 lines of code 
			System.out.println(myElement);
		}
	}
	
	
	public int[] insertIntoArray(int arr[],int information,int position)
	{
		
		arr[position] = information;
		return arr;
		
	}
	
	public void printArray(int arr[])
	{
		for (int myElement : arr) {
			System.out.println(myElement);
		}
	}
	public int getInformation(int arr[],int position)
	{
		if(position>arr.length)
		{
			return -1;
		}
		return arr[position];
	}
	
	// This method accept an array and the element to be searched and return the index value if element found
	// otherwise return -1;
	// as well as return -2 if array is empty
	public int searchElement(int arr[], int a)
	{
		boolean flag = false;
		int temp=0;
		if (arr.length != 0)
		{	
		for (int i=0; i<arr.length; i++)
		{
			if (a == arr[i])
			{
				temp = i;
				flag = true;
			}
		}
		if (flag == true)
			return temp;
		else 
			return -1;
		}
		else 
			return -2;
		
	}
	
	/*
	 * this method returns an array of size 2, containing min and max number of the given array, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMinMax(int arr[])
	{
		int arrmaxmin[] = new int[2];
		int max,min;
		max = arr[0];
		min = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (max < arr[i])
				max = arr [i];
			else if (min > arr[i])
				min = arr [i];
		}
		arrmaxmin [0] = min;
		arrmaxmin [1] = max;
		
		return arrmaxmin;
	}
	
	/*
	 * this method returns an array which contains the multiples of x, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMultiplesOf(int arr[],int x)
	{
		int arrMult[] = new int[10];
		int arrMult1[] = new int[10];
		int j = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%x == 0)
				{
					arrMult[j] = arr[i];
					j++;
				}
		}	
		return arrMult;
	}
	
	
	
}//end class



