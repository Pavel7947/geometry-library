package ru.practicum;

public class Square extends GeometricShape {
    private final double a;
    private final double b;

    public Square(double a, double b) {
        super("SQUARE");
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
}
