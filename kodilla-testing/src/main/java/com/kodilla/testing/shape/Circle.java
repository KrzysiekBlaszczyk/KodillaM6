package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName;
    private double sideOfShape;

    public Circle(String shapeName, double sideOfShape) {
        this.shapeName = shapeName;
        this.sideOfShape = sideOfShape;
    }

    public String getShapeName(String shapeName) {
        return shapeName;
    }

    public Double getFiled(double sideOfShape) {
        return sideOfShape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.sideOfShape, sideOfShape) == 0 && shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideOfShape);
    }
}
