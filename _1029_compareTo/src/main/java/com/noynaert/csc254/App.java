package com.noynaert.csc254;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args )
    {
        Section a = new Section("CSC 184", "Programming Concepts 1", "20324");
        Section b = new Section("CSC 254", "Programming Concepts 2", "30221");
        Section c = new Section("CSC 184", "Programming Concepts 1", "20323");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.hashCode());
        System.out.println("Qwerty: " + "Qwerty".hashCode());
        System.out.println("qwerty: " + "qwerty".hashCode());


        System.out.println( "Hello World!" );
    }


}
