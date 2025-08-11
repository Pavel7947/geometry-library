package ru.practicum;

public abstract class ThreeDimensionalGeometricShare {
    private final String typeShare;

    public ThreeDimensionalGeometricShare(String typeShare) {
        this.typeShare = typeShare;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    public String getTypeShare() {
        return typeShare;
    }
}
