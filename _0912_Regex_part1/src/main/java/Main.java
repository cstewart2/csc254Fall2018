import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public final static String TARGET = "(Wed|Sat)\\,\\s+[JFMASOND][a-z]{2}\\s+\\d+\\,\\s+\\d{4}\\s+\\d+(-\\d+){5}\\s+\\$\\s+\\d+\\.\\d\\d\\s+Million$";
    public static void main(String[] args) throws FileNotFoundException {

        LocalDate startDate = LocalDate.of(2017,9,1);
        LocalDate endDate   = LocalDate.of(2017, 9,13);
        LocalDate gameDate = LocalDate.of(2017,9,14);

        System.out.println(isBetweenDates(startDate, endDate, gameDate));
        System.exit(0);

        Scanner input = new Scanner(new File("lotto.txt"));

        while(input.hasNextLine()){
            String line = input.nextLine();
            /*
            if(
                    ..
            ){
                System.out.println(line);
            }
            */
        }

        input.close();

        System.out.println("Output by J. Evan Noynaert");
    }


    public static boolean isBetweenDates(LocalDate startDate, LocalDate endDate, LocalDate gameDate){
        boolean isBetween = true;

        /*
        Tacky style.  Don't do this

        if( startDate.compareTo(gameDate) <= 0)   //true if startDate is before or equal to gameDate
             isBetween = true;
        else
            isBetween = false;
        */
        //isBetween = (1 < 2);
        isBetween = (startDate.compareTo(gameDate) <= 0  && endDate.compareTo(gameDate) >=0 );

        return isBetween;
    }
}
