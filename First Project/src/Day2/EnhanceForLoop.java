package Day2;

public class EnhanceForLoop {
 public static void main(String[] args) {
	int arr[][] = new int[][] {
		{45,46,48},
		{77,88,99}
	};
	for (int[] i : arr)
		for (int j : i)
			System.out.println(j);
}
}
