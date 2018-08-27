import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int count;
        count = processFile("input.txt");

        System.out.printf("\n%d numbers were read\n", count);
        System.out.println("Done!");
    }

    public static int processFile(String fileName){
        int n = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextDouble()){
                double number = input.nextDouble();
                System.out.printf(" %3d. %8.2f\n", n, number);
                n++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ouch.  Something went wrong!!");
            System.err.println(e.getMessage());
            System.exit(1);

        }

        return n;
    }
}
