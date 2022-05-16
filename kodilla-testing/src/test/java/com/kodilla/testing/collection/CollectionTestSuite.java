package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create OddNumbersExterminator with empty list " +
            "then method exterminate should return true"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator list = new OddNumbersExterminator();
        List<Integer> emptylist = new ArrayList<>();
        //When
        List<Integer> resultList = list.exterminate(emptylist);
        //Then
        Assertions.assertEquals(emptylist,resultList);
    }
    @DisplayName("when create OddNumbersExterminator with number list " +
            "then method exterminate should return new list and program check equals values"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator list = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(2);
        normalList.add(6);
        normalList.add(3);
        normalList.add(1);
        normalList.add(7);
        normalList.add(8);
        List<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(6);
        expectedResultList.add(8);
        //When
        List<Integer> resultList = list.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedResultList,resultList);

    }
}
