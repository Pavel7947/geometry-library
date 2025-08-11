package ru.practicum;

public class Cube extends GeometricShape {
    private final double a;


    public Cube(double a) {
        super("CUBE");
        this.a = a;
    }

    @Override
    public double getSquare() {
        return 6 * (a * a);
    }

    @Override
    public double getPerimeter() {
        return 12 * a;
    }
}
