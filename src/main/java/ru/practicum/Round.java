package ru.practicum;

public class Round extends TwoDimensionalGeometricShape {
    private final double d;

    public Round(double d) {
        super("ROUND");
        this.d = d;
    }

    @Override
    public double getSquare() {
        return Math.pow(d / 2, 2) * 3.14;
    }

    @Override
    public double getPerimeter() {
        return d * 3.14;
    }
}
