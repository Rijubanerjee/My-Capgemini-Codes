package com.cg.client;

import java.util.Scanner;

import com.cg.bean.Calculator;
import com.cg.util.Util;

public class Calcclient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator ob = new Calculator();
		try {
			System.out.println("Enter the amount:");
			double pamt = sc.nextDouble();
			System.out.println("Enter the year:");
			int pterm = sc.nextInt();
			System.out.println("Enter the rate:");
			float prate = sc.nextFloat();
			ob.setAmt(pamt);
			ob.setRate(prate);
			ob.setYears(pterm);

			double si = ob.calSimple();
			double ci = ob.calcComp();
			System.out.println("The simple interest is " + Util.roundoff(si) + " and the compound interest is "
					+ Util.roundoff(ci));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
