package com.smoothstack.assignments.day02;

import com.smoothstack.assignments.day02.Point;
interface Shape {
    float getArea();
    Point getCenter();
    boolean contains(Point p);
}