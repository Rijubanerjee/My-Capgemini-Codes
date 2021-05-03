package com.cg.bean;
import java.util.concurrent.ExecutionException;

import com.cg.util.CgUtil;

public class Circle {
	public double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) throws Exception {
		if (radius <= 0)
			throw new Exception("Radius must be greater than 0");
		this.radius = radius;
	}
	public double calArea () {
		return Math.PI * this.radius* this.radius;
	}
	public double calPerimeter() {
		return CgUtil.TWO * Math.PI * this.radius;
	}

}
