package com.cg.service;

public class Pallimdrome {
	public boolean checkPallimdrome(String str) {
		if (!str.matches("[A-Za-z]{2,}"))
			return false;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if (str.contentEquals(sb))
			return true;
		return false;
	}

}
