package com.cg.util;

public class CgUtil {
	public static final int TWO = 2;
	public static final double H = 100.0;
	
	public static double roundoff(double x)
	{
		double res = Math.round(x * H)/H;
		return res;
	}

}
