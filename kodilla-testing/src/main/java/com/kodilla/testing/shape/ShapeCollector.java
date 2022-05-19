package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return list.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < list.size() && n >=0) {
            return list.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        return list.toString();
    }

    public int getListQuantity() {
        return list.size();
    }
}
