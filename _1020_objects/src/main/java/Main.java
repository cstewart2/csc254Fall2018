public class Main {
    public static void main(String[] args){
        Person pn = new Person("Fred", 12);

        //Will not Work because age and name are private
        // pn.age = 29;
        // pn.name = "Fred";

        //Still works
        pn.setName("Fred");
        pn.setAge(29);

        System.out.println("Name: " + pn.getName());
        System.out.println("Age:" + pn.getAge());

        Person wife = new Person("Wilma", 30);
        //wife.setName("Wilma");
        //wife.setAge(30);

        System.out.println("\nName: " + wife.getName());
        System.out.println("Age:" + wife.getAge());
        System.out.println("\nName: " + pn.getName());
        System.out.println("Age:" + pn.getAge());

        System.out.println(pn.hashCode());
        System.out.println(wife.hashCode());

        //Printing with toString
        System.out.println(pn.toString());
        System.out.println(wife);

        System.out.println("Done");
    }
}
