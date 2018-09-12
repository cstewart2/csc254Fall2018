import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public final static String TARGET = "(Wed|Sat)\\,\\s+[JFMASOND][a-z]{2}\\s+\\d+\\,\\s+\\d{4}\\s+\\d+(-\\d+){5}\\s+\\$\\s+\\d+\\.\\d\\d\\s+Million$";
    public static void main(String[] args) throws FileNotFoundException {


        Scanner input = new Scanner(new File("lotto.txt"));

        while(input.hasNextLine()){
            String line = input.nextLine();
            if(
                    ..
            ){
                System.out.println(line);
            }
        }

        input.close();

        System.out.println("Output by J. Evan Noynaert");
    }
}
