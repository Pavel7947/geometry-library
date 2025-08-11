package ru.practicum;

public abstract class TwoDimensionalGeometricShape {
    private final String typeShare;

    public TwoDimensionalGeometricShape(String typeShare) {
        this.typeShare = typeShare;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    public String getTypeShare() {
        return typeShare;
    }
}
