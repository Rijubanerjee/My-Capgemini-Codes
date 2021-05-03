package Test;

public class Test {
	public static void main(String[] args) {
		int [] arr1 = new int [5];
		int [] arr2 = new int [5];
		int prev = 0;
		for (int i = 1; i <= 5; i++) {
			arr1[i] = i;
			System.out.println(arr1[i]);
		}
		int position = 4;
		for (int i = 1; i <= 5; i++)
		{

			int diff = arr1[i] - prev;
			arr2[position] = (int) Math.abs(diff);
			prev = arr1[i];
			position --;
			
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(arr2[i]);
		}
	}
}
