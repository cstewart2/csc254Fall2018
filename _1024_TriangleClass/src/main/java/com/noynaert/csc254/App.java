package com.noynaert.csc254;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Triangle tepee = new Triangle(3, 4);
        Triangle thing = new Triangle( 4.2, 2.3);
        thing.setHeight(6.0);
        Triangle iso = new Triangle(4);
        Triangle one = new Triangle(1);
        Triangle problem = new Triangle( -2.0);

        System.out.println(tepee);
        System.out.println(thing);
        System.out.println(iso);
        System.out.println(one);
        System.out.println(problem);
        System.out.println( "Goodbye World!" );
    }
}
