package com.cg.client;

import com.cg.bean.Mtable;

public class Mtableclient {
	public static void main(String[] args) {

		try {
			Mtable obj = new Mtable(5);
			obj.display();
			obj.display(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
