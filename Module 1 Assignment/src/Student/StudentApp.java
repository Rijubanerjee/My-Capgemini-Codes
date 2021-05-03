package Student;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("Enter Name:");
			String n = sc.nextLine();
			System.out.println("Enter Student ID:");
			int Id = sc.nextInt();
			System.out.println("Enter English Marks:");
			int e = sc.nextInt();
			System.out.println("Enter Vernacular Marks:");
			int v = sc.nextInt();
			System.out.println("Enter Maths Mrks:");
			int m = sc.nextInt();
			System.out.println("Enter Physics Marks:");
			int p = sc.nextInt();
			System.out.println("Enter Chemistry Marks:");
			int ch = sc.nextInt();
			System.out.println("Enter Computer Marks:");
			int c = sc.nextInt();
			System.out.println("Enter Extra Marks:");
			int ex = sc.nextInt();
			System.out.println("Enter Fees:");
			int F = sc.nextInt();
			
		Student st = new Student(Id, n, e, v, m, p, ch, c, ex, F);
		System.out.println("Name"+st.getFullName());
		System.out.println("ID"+st.getStudentID());
		System.out.println("English Marks"+st.getEngMarks());
		System.out.println("Vernacular Marks"+st.getVernMarks());
		System.out.println("Mathametics Marks"+st.getMathMarks());
		System.out.println("Physics Marks"+st.getPhysMarks());
		System.out.println("Chemistry Marks"+st.getChemMarks());
		System.out.println("Computer Marks"+st.getCompMarks());
		System.out.println("Extra Marks"+st.getExtraMarks());
		System.out.println("Fees"+st.getFees());
		
		int F1 = st.getFees();
		int F2 = st.getFinalFees();
		if(F1 != F2)
			System.out.println("The fees will be increased for Student has failed in total an the fees is"+F2);
		else
			System.out.println("Final Fees:"+st.getFinalFees());
		
		System.out.println(" Do u want to exe more <0 for exit>");
		choice = sc.nextInt();
		
		}while (choice != 0);
	}
}
