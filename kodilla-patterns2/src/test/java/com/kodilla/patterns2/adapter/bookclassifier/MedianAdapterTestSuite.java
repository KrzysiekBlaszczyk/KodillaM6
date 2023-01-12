package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Jan Kowalski","Java podstawy", 1925,"1"));
        books.add(new Book("Jan Kowalski","Java podstawy 2", 1930,"2"));
        books.add(new Book("Jan Kowalski","Java podstawy 3", 1935,"3"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //Then
        int median = medianAdapter.publicationYearMedian(books);
        //When
        System.out.println(median);
        assertEquals(median, 1930);
    }
}
