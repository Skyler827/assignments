package com.smoothstack.assignments.day02;

import com.smoothstack.assignments.day02.Shape;

public class Rectangle implements Shape {
	
	Point center;
	float width;
	float height;
	
	Rectangle() {
		center = new Point(0,0);
		width = 1;
		height = 1;
	}
	Rectangle(float width, float height) {
		width = Math.abs(width);
		height = Math.abs(height);
		center = new Point(width/2, height/2);
		this.width = width;
		this.height = height;
	}
	Rectangle(float x0, float y0, float x1, float y1) {
		center = new Point(x0/2+x1/2, y0/2+y1/2);
		width = Math.abs(x1-x0);
		height = Math.abs(1-y0);
	}
    public float getArea() {
        return width * height;
    }

	public boolean contains(Point p) {
		if (p.x < center.x-width/2) return false;
		if (p.x > center.x+width/2) return false;
		if (p.y < center.y-height/2) return false;
		if (p.y > center.y+height/2) return false;
		return true;
	}

	public Point getCenter() {
		return center;
	}
    
}