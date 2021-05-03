package Lab3;

import java.util.*;

public class Exercise8 {
	static boolean isAlphabaticOrder(String s)
    {
        
        int n = s.length();
       
        
        char c[] = new char [n];
       
        
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
       
      
        Arrays.sort(c);
       
      
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
               
        return true;    
    }
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
    	String s = sc.nextLine();
         
    	s.toUpperCase();
        if (isAlphabaticOrder(s))
           System.out.println("Postive String");
        else
            System.out.println("Negative String");
        sc.close();
    }
}
