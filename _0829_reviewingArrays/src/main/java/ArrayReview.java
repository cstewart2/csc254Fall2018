public class ArrayReview {
    public static void main(String[] args){
        final int MAXIMUMSIZE = 5;
        double[] list = new double[MAXIMUMSIZE];

        System.out.println("List is " + list);
        print(list,MAXIMUMSIZE);
        list[3] = 77.7;
        print(list,MAXIMUMSIZE);
        System.out.println("list[4] is " + list[4]);
    }

    public static void print(double[] numbers, int n){
        numbers = new double[9];
        for(int i=0;i<n;i++){
            System.out.printf("[%d] %f\n", i, numbers[i]);
        }
        numbers[4] = 123.456;
    }
}
