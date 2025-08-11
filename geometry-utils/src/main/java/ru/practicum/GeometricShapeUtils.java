package ru.practicum;

public class GeometricShapeUtils {

    public static double compare(TwoDimensionalGeometricShape shape1, TwoDimensionalGeometricShape shape2) {
        if (!shape1.getTypeShare().equals(shape2.getTypeShare())) throw new ArithmeticException();
        return shape1.getSquare() - shape2.getSquare();
    }
}
