package com.cg.bean;

public class Mtable {
	private int num;

	public Mtable(int num) throws Exception {
		super();
		if (num <= 0)
			throw new Exception("Number should be greater than 0");
		this.num = num;
	}

	public void display() {
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d * %d = %d\n", i, num, num * i);
	}

	public void display(int rows) {
		for (int i = 1; i <= rows; i++)
			System.out.printf("%d * %d = %d\n", i, num, num * i);
	}

}
