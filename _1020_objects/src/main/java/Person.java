public class Person {
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }


    //Setters
    public void setName(String name){
        if(name.length() == 0)
            this.name = "ANONYMOUS";
        else
            this.name = name;
    }
    public void setAge(int age){
        if (age < 0)
            this.age = 0;
        else if (age > 120)
            this.age = 120;
        else this.age = age;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //toString
    @Override
    public String toString(){
        String result = String.format("Name: %s, Age: %d", name, age);
        return result;
    }

}
