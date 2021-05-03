package com.cg.beans;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {

	static Map<Integer, Emp> emap = new HashMap<>();
	static {
		emap.put(1003, new Emp(1003, "ram", 56000));
		emap.put(1002, new Emp(1002, "tom", 46000));
		emap.put(1004, new Emp(1004, "sam", 76000));
		emap.put(1002, new Emp(1002, "george", 46000));

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Emp Id :");
		int eid = scan.nextInt();

		if (emap.containsKey(eid))
			System.out.println(emap.get(eid));
		else
			System.out.println("not Found");
		scan.close();

	}

}
