package com.cg.client;

import java.util.Scanner;

import com.cg.bean.Circle;
import com.cg.util.CgUtil;

public class CircleClient {
	public static void main(String[] args) {
		Circle ob = new Circle();
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the radius:");
		double radius = sc.nextDouble();
		
		ob.setRadius(radius);
		double area = ob.calArea();
		double parameter = ob.calPerimeter();
		System.out.println("The Area is "+CgUtil.roundoff(area)+" and the parameter is "+CgUtil.roundoff(parameter));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
