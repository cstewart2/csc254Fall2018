import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Hmwk02 {
    public static void main(String[] args){
        Scanner input = openFile("input.txt");
        int pairsProcessed;
        pairsProcessed = processDates(input);
        input.close();
        System.out.println("\nPairs Processed: " + pairsProcessed);
        System.out.println(makeDate("9/15/2018"));
        System.out.println(makeDate("5/7/2000"));
    }
    public static LocalDate makeDate(String s){
        LocalDate date = null;

        return date;
    }
    public static int processDates(Scanner input){
        int count = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] parts = line.split(":");
            System.out.println(line);
            for(int i=0;i<parts.length;i++){
                System.out.println("\t"+parts[i]);
            }
            if(parts.length == 2){
                count++;
            }
        }

        return count;
    }


    public static Scanner openFile(String fileName){
        Scanner input = null;

        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("ERROR:  Could not open file " + fileName);
            System.exit(1);
        }
        return input;
    }
}
