package Empsys;

import java.util.Scanner;

import Student.Student;

public class HRSystem {
	Employee arr[] = new Employee[5];
	int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		HRSystem in = new HRSystem();
		do {
			System.out.println("Enter Employee Name:");
			String nam = sc.nextLine();

			System.out.println("Enter Employee ID:");
			int Id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee experience:");
			int exp = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Project Name:");
			String pro = sc.nextLine();

			Employee Emp;

			Emp = new Employee(Id, nam, pro, exp);

			in.insertEmployee(Emp);

			System.out.println(" Do u want to exe more <0 for exit>");
			choice = Integer.parseInt(sc.nextLine());
		} while (choice != 0);
		in.displayEmployee();

	}

	public void insertEmployee(Employee Emp) {
		arr[count++] = Emp;
	}

	public void displayEmployee() {
		int n = this.count;
		for (int i = 0; i < n; i++) {
			arr[i].workingOnProject();
		}
	}

}
