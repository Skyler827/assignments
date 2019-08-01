package com.smoothstack.assignments.day02;
import com.smoothstack.assignments.day02.Point;
import com.smoothstack.assignments.day02.Shape;

public class Triangle implements Shape {
	Point p1;
	Point p2;
	Point p3;
	
    public Triangle() {
    }
    public Triangle(Point p1, Point p2, Point p3) {
    	this.p1 = p1;
    	this.p2 = p2;
    	this.p3 = p3;
    }
    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
    }

    public float getArea() {
        return 0;
    }

    public float getDistanceFromOrigin() {
        return 0;
    }
	public Point getCenter() {
		return new Point((p1.x+p2.x+p3.x)/3, (p1.y+p2.y+p3.y)/3);
	}
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

}