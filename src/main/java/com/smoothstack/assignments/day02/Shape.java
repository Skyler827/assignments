package com.smoothstack.assignments.day02;

import com.smoothstack.assignments.day02.Point;
interface Shape {
    Point[] getVertices();
    float getArea();
    float getDistanceFromOrigin();
}