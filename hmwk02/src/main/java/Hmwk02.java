import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hmwk02 {
    public static void main(String[] args){
        Scanner input = openFile("input.txt");
        int pairsProcessed;
        pairsProcessed = processDates(input);
        input.close();
        System.out.println("\nPairs Processed: " + pairsProcessed);
    }

    public static int processDates(Scanner input){
        int count = 0;

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
