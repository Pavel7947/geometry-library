package ru.practicum;

public class Triangle extends TwoDimensionalGeometricShape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        super("TRIANGLE");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        double p = (a + b + c) / 2; // Полупериметр
        return p * (p - a) * (p - b) * (p - c);
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
