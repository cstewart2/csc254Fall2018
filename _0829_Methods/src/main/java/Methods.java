public class Methods {
    public static void main(String[] args){
        int age = 25;
        double tallness = 72.1;

        method1(age, tallness);
        method1(30, 64.3);
        System.out.println("In main age is " + age);

        System.out.println(method2(3.14159));
        tallness = method2(tallness);
        System.out.println("Tallness is now " + tallness);
        //System.out.println("The result is " + result);// "result" is not in scope
        System.out.println("Done");
    }

    public static void method1(int age, double height){
        age = age / 2;
        System.out.println(age + " " + height);
    }

    public static double method2(double number){
        double result = number * 3.0;

       // result = tallness;  //does not work because tallness is not in scope

        return result;

    }

}
