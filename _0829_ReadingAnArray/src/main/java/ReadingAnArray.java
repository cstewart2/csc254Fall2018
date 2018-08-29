import java.util.Scanner;

public class ReadingAnArray {
    public static void main(String[] args){
        final int MAX = 3;
        double[] list = new double[MAX];
        print(list,MAX);
        int n =read(list,MAX);
        print(list,n);

    }

    public static void print(double[] numbers, int n){
        System.out.println("--------");
        for(int i = 0;i < n; i++){
            System.out.printf("[%d] %8.2f\n", i, numbers[i]);
        }
    }

    public static int read(double[] numbers, int max){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<max;i++){
            System.out.print("Enter a number: ");
            numbers[i] = input.nextDouble();
        }

        return max;
    }
}
