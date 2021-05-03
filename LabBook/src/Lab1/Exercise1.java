package Lab1;
import java.util.*;
import java.lang.*;

public class Exercise1 {
	 public static int sum(int n)
	    {
	        int sum = 0;
	        for (int x=1; x<=n; x++)
	            sum += x*x*x;
	        return sum;
	    }
	  
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int n = sc.nextInt();
	        
	        System.out.println(sum(n));
	  
	    }
}