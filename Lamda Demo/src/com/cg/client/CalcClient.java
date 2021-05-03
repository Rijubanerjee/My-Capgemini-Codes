package com.cg.client;

import com.cg.demos.Icalc;

public class CalcClient {
	
	public static void main(String[] args) {
		display((a,b)->{return a+b;},10,5);
		display((a,b)->{return a-b;},10,5);
		display((a,b)->{return a*b;},10,5);
		display((a,b)->{return a/b;},10,5);
		
		
	}
	
	public static void display(Icalc obj, int v1,int v2) {
		System.out.println(obj.doCalc(v1, v2));
		
	}

}
