package ru.practicum;

public abstract class GeometricShape {
    private final String typeShape;

    public GeometricShape(String typeShape) {
        this.typeShape = typeShape;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    public String getTypeShape() {
        return typeShape;
    }
}
