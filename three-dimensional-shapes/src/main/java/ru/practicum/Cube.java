package ru.practicum;

public class Cube extends ThreeDimensionalGeometricShare{
    private final double a;


    public Cube(double a) {
        super("Cube");
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
