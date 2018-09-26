package com.noynaert.csc254;

/**
 * This program demonstrates various standard array operations.
 * @author J. Evan Noynaert
 * @since 2018-09-19
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("5/2 is " +  (double)5/2);  //"Cast" 5 to a double

        double[] list = {3.14159, -88.7, 1.414, 0, -3.2, 88.7, Math.PI, -88.7, -1.0};
        print(list, list.length);
        double[] empty = {};
        double[] one = { Math.PI};
        //print(list);
        double minimum = findSmallest(list, list.length);
        System.out.println("The smallest value is " + minimum);

        minimum = findSmallest(empty, empty.length);
        System.out.println("The smallest value is " + minimum);

        double average = findAverage(list, list.length);
        System.out.println("The average value is " + average);
        average = findAverage(one, one.length);
        System.out.println("The average value is " + average);

        System.out.println(contains(list,list.length, -88.7));
        System.out.println(contains(empty,empty.length, -88.7));
        System.out.println(contains(one,one.length, -88.7));




        System.out.println("Done");
    }

    /**
     * This method searches an array of doubles for the occurance of a specified
     * double value.
     *
     * @param haystack  The array to be searched
     * @param n         The number of actual items in the array.  Note that the
     *                  array may be physically larger than the logical size
     *                  specified by n
     * @param needle    The double value to be searched
     * @return          <ul><li>Returns true if the double is found in the haystack array</li>
     *                  <li>Returns false if the double is not found in the haystack array.</li>
     *                  <li>Always returns false if the haystack array is empty.</li></ul>
     */
    public static boolean contains(double[] haystack, int n, double needle){
        boolean found = false;

        int i = 0;
        while(!found && i < n) {
            found = (haystack[i] == needle);
            i++;
        }
        return found;
    }

    public static double findSmallest(double[] list, int n) {
        double smallestSoFar = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (list[i] < smallestSoFar) {
                smallestSoFar = list[i];
            }
        }
        if (smallestSoFar == Double.MAX_VALUE)
            smallestSoFar = Double.NaN;

        return smallestSoFar;
    }

    public static double findAverage(double[] list, int n){
        double average = 0.0;
        for (int i = 0; i < n; i++){
            average += list[i];
        }
        average = average/n;
        return average;
    }

    public static void print(double[] list, int n) {
        System.out.println("-----------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%2d] %f\n", i, list[i]);
        }
    }

    //overloading a method
    public static void print(double[] list) {
        System.out.println("-----------------");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("[%2d] %f\n", i, list[i]);
        }
    }
    public static void findEquals(int needle, int[] counts){
        /*
        for(each item in the array)
            if(needle == counts[i])
                print counts[i]    //this is probably wrong.
        */
    }
}
