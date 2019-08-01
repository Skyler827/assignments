package com.smoothstack.assignments.day02;
import java.lang.Math;
class Point {
    float x;
    float y;
    Point(float x_, float y_) {
        x = x_;
        y = y_;
    }
    float norm() {
    	return (float) Math.sqrt(x+y);
    }
}