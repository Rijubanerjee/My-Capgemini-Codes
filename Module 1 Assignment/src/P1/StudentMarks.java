package P1;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Marks of English:");
	int eng= sc.nextInt();
	System.out.println("Marks of JAVA:");
	int jv= sc.nextInt();
	System.out.println("Marks of DBMS:");
	int db= sc.nextInt();
	System.out.println("Marks of Spring tools:");
	int sp= sc.nextInt();
	System.out.println("The total marks obtained is:"+(eng+jv+db+sp));
	System.out.println("The average of the total marks is:"+((eng+jv+db+sp)/4));
	}
}
