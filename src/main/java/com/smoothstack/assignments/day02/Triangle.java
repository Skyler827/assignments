package com.smoothstack.assignments.day02;
import com.smoothstack.assignments.day02.Point;
import com.smoothstack.assignments.day02.Shape;

public class Triangle implements Shape {
    Point[] vertices;

    public Triangle() {
        vertices = null;
    }
    public Triangle(Point p1, Point p2, Point p3) {
        this.vertices = new Point[]{p1, p2, p3};
    }
    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        
    }
    public Point[] getVertices() {
        return null;
    }

    public float getArea() {
        return 0;
    }

    public float getDistanceFromOrigin() {
        return 0;
    }

}