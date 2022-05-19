package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String shapeName;
    private double sideOfShape;

    public Triangle(String shapeName, double sideOfShape) {
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
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideOfShape, sideOfShape) == 0 && shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideOfShape);
    }
}
