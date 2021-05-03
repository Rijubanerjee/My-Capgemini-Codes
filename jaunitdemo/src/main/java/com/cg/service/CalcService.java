package com.cg.service;

public class CalcService {

	public double CalcSeries(int a, int b, int c) {
		double res = (a + b + c) / 2;
		return res;
	}

	public long calcSeries(int num) {
		long sum = 0;
		sum = num * (num+1)/2;

		return sum;
	}
}
