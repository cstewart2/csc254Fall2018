package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input;
        //LocalDate startDate
        //LocalDate endDate

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
        int n = 0;

        try {
            Scanner input = new Scanner(new File("lotto.txt"));
            while(input.hasNextLine()){
                String line;
                String pattern = "(Sat)|(Wed),.*Million";
                line = input.nextLine();
                if(line.matches(pattern)) {
                    System.out.println("Line: " + line);  //comment out this line
                    String[] parts = line.split("\\s+");
                    System.out.println("The year string is "+ parts[3] );
                    n++;
                }

            }


            input.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("Could not find file lotto.txt");
            System.exit(1);
        }
        return n;
    }
}
