package com.smoothstack.assignments.day02;

import com.smoothstack.assignments.day02.Shape;
import java.lang.Math;
public class Circle implements Shape{
	
	Point center;
	float radius;
	
	public float getArea() {
		return (float) (Math.PI * Math.pow(radius, 2));
	}

	public Point getCenter() {
		return center;
	}

	public boolean contains(Point p) {
		return radius > Math.sqrt(Math.pow(p.x-center.x, 2) + Math.pow(p.y-center.y, 2));
	}}