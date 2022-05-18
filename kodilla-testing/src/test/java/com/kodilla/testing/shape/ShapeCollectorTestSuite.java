package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for Add")
    class TestAdd {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 3);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getListQuantity());
        }
    }

    @Nested
    @DisplayName("Test for Get")
    class TestGet {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 3);
            shapeCollector.addFigure(shape);
            //When
            Shape shapeResult = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, shapeResult);
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 3);
            shapeCollector.addFigure(shape);
            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);
            //When
            List<Shape> shapeResultList = new ArrayList<>();
            shapeResultList.add(new Circle("Circle", 3));
            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }
    @Nested
    @DisplayName("Test for Remove")
    class TestRemove {
    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 3);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getListQuantity());

    }

}}
