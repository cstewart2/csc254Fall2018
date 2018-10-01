package com.noynaert.csc254;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        for (int number = -25; number < 25; number++) {
            int result = number * number;
            System.out.printf("Number is %d, and the square is %d\n", number, result);
        }
        System.out.println(endsBeforeComma("03,"));
        System.out.println(endsBeforeComma("03"));
        System.out.println(endsBeforeComma("02,456"));


    }
    public static void boo(){
        System.out.println("Boo");
    }

    public static int square(int number) {
        int result = 0;
        System.out.println("in integer version of square");
        result = number * number;
        return result;
    }
    public static double square(double number){
        double result = 0.0;
        result = number * number;
        return result;
    }
    public static String endsBeforeComma(String s){
        String result = "";
        int position = s.indexOf(',');
        System.out.println("Position is " + position);
        /*
        if(position == -1)
            result = s;
        else
            result = s.substring(0, position);
        */

        result = (position == -1) ? s : s.substring(0,position);

        return result;
    }

}
