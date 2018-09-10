public class Main {
   public static void main(String[] args){
       String person = "Fred:29";   //tab-delimited
       String friend = "Barney:28";
       String dog = "Dino:2";
       String wife = new String("Wilma  30");

       if(person.compareTo(friend) > 0)   //tacky method
           System.out.println("True");
       else
           System.out.println("False");

       System.out.println(person.compareTo(dog) > 0);

       String theName;
       int theAge;

       String[] parts = person.split(":");

       theName = parts[0];
       theAge  = Integer.parseInt(parts[1]);
       System.out.printf("%s is %d years old\n", theName, theAge);


       System.out.println("Done");
   }



}
