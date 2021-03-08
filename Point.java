package com.company;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public Point middle(Point p) {

        return new Point((this.x + p.x) / 2, (this.y + p.y) / 2);
    }

    public double distance(Point p) {

        double diffX = Math.pow(x - p.x, 2);
        double diffY = Math.pow(y - p.y, 2);

        return Math.sqrt(diffX + diffY);
    }

    public Double areaSize(Point p, Point t) {

        double diff1 = x * (t.y - p.y);
        double diff2 = p.x * (y - t.y);
        double diff3 = t.x * (p.y - y);

        return Math.abs(diff1 + diff2 + diff3) / 2;
    }

    public double slope(Point p) {
        return (this.y-p.y) / (this.x-p.x);
    }
}