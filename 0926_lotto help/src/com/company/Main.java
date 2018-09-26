package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input;
        LocalDate startDate
        LocalDate endDate

        /* Stuff we already did in class, I think
        int totalDataLines;
        startDate = getDate();
        endDate = getdate();
        */
        int[] counts = new int[45];

        //print "Searching for draws from [[startDate]] to [[endDate]]"

//        int totalDataLines = processFile(startDate, endDate, counts);
        int totalDataLines = processFile  (null, null, counts);

        System.out.printf("Total date lines in the file: %d\n",totalDataLines);

        System.out.println(" Program by your name");
    }
    public static int processFile(LocalDate startDate, LocalDate enddate, int[] counts){

    }
}
