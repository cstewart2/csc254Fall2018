import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        LocalDate wednesday = LocalDate.now();
        System.out.printf("Today is %s\n", wednesday);
        LocalDate tomorrow = LocalDate.of(2018,9,6);
        System.out.printf("Tomorrow is %s which is %s\n", tomorrow, tomorrow.getDayOfWeek());

        System.out.printf("wednesday is same as tomorrow? %b\n", wednesday.equals(tomorrow) );
        System.out.printf("wednesday is before tomorrow? %b\n", wednesday.isBefore(tomorrow));
        System.out.println("wednesday is bofore tomorrow? " + wednesday.isBefore(tomorrow));

        System.out.println("Done.");
    }
}
