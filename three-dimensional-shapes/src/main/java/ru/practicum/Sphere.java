package ru.practicum;

public class Sphere extends ThreeDimensionalGeometricShare {
    private final double d;

    public Sphere(double d) {
        super("Sphere");
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
