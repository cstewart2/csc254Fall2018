package com.noynaert.csc254;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    public static double DELTA = 0.0001;
    public static double ZERO = 0.0;
    public static double NEG = -2.0;
    public static double ONE = 1.0;
    public static double A = 5.7;
    public static double B = 3.2;
    public static double C = 0.25;
    public static double D = 0.75;

    public Triangle a = new Triangle();
    public Triangle b = new Triangle(ZERO);
    public Triangle c = new Triangle(NEG);
    public Triangle d = new Triangle(ONE);
    public Triangle e = new Triangle(A);
    public Triangle f = new Triangle(C);
    public Triangle g = new Triangle(A, B);
    public Triangle h = new Triangle(B, A);
    public Triangle i = new Triangle(B, C);
    public Triangle j = new Triangle(C, B);
    public Triangle k = new Triangle(C, D);
    public Triangle l = new Triangle(D, C);
    public Triangle m = new Triangle(A, NEG);
    public Triangle n = new Triangle(A, ZERO);
    public Triangle o = new Triangle(ZERO, NEG);
    public Triangle p = new Triangle(A,A);
    public Triangle q = new Triangle(NEG, D);

    @Test
    public void getBase() {
        assertEquals(1.0, a.getBase(),DELTA);
        assertEquals(1.0, b.getBase(),DELTA);
        assertEquals(1.0, c.getBase(),DELTA);
        assertEquals(1.0, d.getBase(),DELTA);
        assertEquals(A, e.getBase(),DELTA);
        assertEquals(C, f.getBase(),DELTA);
        assertEquals(A, g.getBase(),DELTA);
        assertEquals(A, h.getBase(),DELTA);
        assertEquals(B, i.getBase(),DELTA);
        assertEquals(A, j.getBase(),DELTA);
        assertEquals(D, k.getBase(),DELTA);
        assertEquals(D, l.getBase(),DELTA);
        assertEquals(A, m.getBase(),DELTA);
        assertEquals(A, n.getBase(),DELTA);
        assertEquals(1.0, o.getBase(),DELTA);
        assertEquals(A, p.getBase(),DELTA);
        assertEquals(1.0, q.getBase(),DELTA);



    }

    @Test
    public void getHeight() {
        assertEquals(1.0, a.getHeight(),DELTA);
        assertEquals(1.0, b.getHeight(),DELTA);
        assertEquals(1.0, c.getHeight(),DELTA);
        assertEquals(1.0, d.getHeight(),DELTA);
        assertEquals(A, e.getHeight(),DELTA);
        assertEquals(C, f.getHeight(),DELTA);
        assertEquals(A, g.getHeight(),DELTA);
        assertEquals(A, h.getHeight(),DELTA);
        assertEquals(B, i.getHeight(),DELTA);
        assertEquals(B, j.getHeight(),DELTA);
        assertEquals(D, k.getHeight(),DELTA);
        assertEquals(D, l.getHeight(),DELTA);
        assertEquals(A, m.getHeight(),DELTA);
        assertEquals(A, n.getHeight(),DELTA);
        assertEquals(1.0, o.getHeight(),DELTA);
        assertEquals(A, p.getHeight(),DELTA);
        assertEquals(1.0, q.getHeight(),DELTA);
    }

    @Test
    public void testToString() {
    }

    @Test
    public void getArea() {
    }
}