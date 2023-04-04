package com.example.oop11;

import java.util.List;

public class OperationsData{
    private final Operations operations;
    private final List<Point> points;

    public OperationsData(double start, double end, double step){
        operations = new Operations();
        int nSteps = operations.calcSteps(start, end, step);
        points = operations.getMassiveFromData(start, step, nSteps);
    }

    public List<Point> getList(){
        return points;
    }
    public Point getMax(){
        return operations.findMax(points);
    }
    public Point getMin(){
        return operations.findMin(points);
    }
    public double getSum(){
        return operations.sumValues(points);
    }
    public double getAverage(){
        return operations.averageValues(points);
    }

}
