package Lab3;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = null;

		System.out.print("Enter String :: ");
		str = scan.nextLine();


		System.out.println(alterString(str));

		scan.close();

	}

	private static boolean checkVowel(char ch) {
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public static String alterString(String str) {
		str = str.toUpperCase();
		char[] ch1 = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			ch1[i] = str.charAt(i);

			if (ch1[i] >= 'A' && ch1[i] <= 'Z') {

				if (!checkVowel(ch1[i])) {
					ch1[i] = ++ch1[i];

				}
			}
		}
		String str1 = new String(ch1);
		return str1;

	}

}
