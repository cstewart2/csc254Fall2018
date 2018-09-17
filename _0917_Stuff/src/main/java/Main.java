import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String s = "2018/09/17:2018/09/17";

        String[] parts = s.split(":");

        System.out.println(parts[0]);
        System.out.println(parts[1]);

        LocalDate date = getDate();
        System.out.println(date);


        /*

        line.split("\\s+")


        if(monthString.equals("Jan"))
            month = 1;
        else if(monthString.equals("Feb"))
            month = 2;
         */
    }

    /** gets a localdate from the user
     *
     */
    public static LocalDate getDate(){
        LocalDate date = null;

        Scanner input = new Scanner(System.in);


        while (date == null) {
            try {
                System.out.print("Enter a date in 2018-01-30 format: ");
                String line = input.nextLine();

                String[] parts = line.split("-");
                int year = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int day = Integer.parseInt(parts[2]);

                date = LocalDate.of(year, month, day);
            } catch (Exception e) {
                System.out.println("Error in date.  Please use the correct format");
            }
        }
        return date;
    }
}
