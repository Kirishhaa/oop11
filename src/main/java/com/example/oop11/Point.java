package com.example.oop11;

public record Point(double x, double y) {

    @Override
    public String toString() {
        return "x = "+x+"  y = "+y;
    }
}
