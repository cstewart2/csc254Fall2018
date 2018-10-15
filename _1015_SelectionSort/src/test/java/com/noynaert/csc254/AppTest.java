package com.noynaert.csc254;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static String[] s1 = {"Bob", "Ted", "Carol", "Alice", "Sam", "Abe", "Mary", "Betty"};
    public static String[] s2 = {"Bob"};
    public static String[] s3 = {};
    public static String[] e1 = {"Abe", "Alice", "Betty", "Bob", "Carol", "Mary", "Sam", "Ted"};
    public static String[] e2 = {"Bob"};
    public static String[] e3 = {};
    public static String[] e4 = {"Alice","Bob","Carol","Ted"};
    @Test
    public void selectionSort() {
        App.selectionSort(s1, s1.length);
        assertArrayEquals(e1, s1);

        App.selectionSort(s2, 1);
        assertArrayEquals(e2, s2);

        App.selectionSort(s3, 0);
        assertArrayEquals(e3, s3);

        App.selectionSort(s1, 4);
        assertArrayEquals(e4, s1);

    }
}
