package ru.practicum;

public class GeometricShapeUtils {

    public static double compare(GeometricShape shape1, GeometricShape shape2) {
        if (!shape1.getTypeShape().equals(shape2.getTypeShape())) throw new ArithmeticException();
        return shape1.getSquare() - shape2.getSquare();
    }
}
