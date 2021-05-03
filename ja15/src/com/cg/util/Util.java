package com.cg.util;

public class Util {
	public static final int TWO = 2;
	public static final double H = 100.0;
	public static final int o = 1;
	
	public static double roundoff(double x)
	{
		double res = Math.round(x * H)/H;
		return res;
	}
}
