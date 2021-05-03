package Lab3;

import java.lang.StringBuffer;
import java.util.*;

public class Exercise2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();

		s = getimage(s);
		System.out.print(s);

		sc.close();

	}

	public static String getimage(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();
		s = s.concat("|");
		s = s.concat(sb.toString());

		return s;
	}
}
