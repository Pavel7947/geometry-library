package ru.practicum;

public class Sphere extends GeometricShape {
    private final double d;

    public Sphere(double d) {
        super("SPHERE");
        this.d = d;
    }

    @Override
    public double getSquare() {
        return 4 * 3.13 * Math.pow(d / 2, 2);
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException();
    }
}
