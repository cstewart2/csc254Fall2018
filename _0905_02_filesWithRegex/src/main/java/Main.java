//https://mwsu.zoom.us/my/noynaert

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input;
        int recordsProcessed;
        input = openFile("act301.txt");

        recordsProcessed = process(input);

        System.out.println("Records Processed: " + recordsProcessed);
        System.out.println("The Scanner has a value of " + input);
        input.close();
        System.out.println("Done");
    }

    public static int process(Scanner input){
        int n = 0;
        while(input.hasNextLine()){
            String line = input.nextLine();
            n++;
            System.out.printf("%d. %s\n", n, line);
        }

        return n;
    }

    public static Scanner openFile(String fileName){
        Scanner input = null;

        try {
            input = new Scanner(new File (fileName));
        } catch (FileNotFoundException e) {
           //e.printStackTrace();
            System.err.printf("ERROR! Could not open file %s\n", fileName);
            System.exit(1);
        }

        return input;
    }
}
