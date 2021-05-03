package Lab3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println("Enter the date in M/d/yyyy format :");
		String str = sc.nextLine();
		LocalDate date1 = LocalDate.parse(str, dateFormat);
		LocalDate date2 = LocalDate.now();
		System.out.println("Date 1 = " + date1);
		System.out.println("Date 2 = " + date2);
		Period p = Period.between(date1, date2);
		System.out.println("Period = " + p);
		System.out.println("Years (Difference) = " + p.getYears());
		System.out.println("Month (Difference) = " + p.getMonths());
		System.out.println("Days (Difference) = " + p.getDays());
		sc.close();
	}
}
