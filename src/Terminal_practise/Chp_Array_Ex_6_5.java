package Terminal_practise;

import java.util.Scanner;

public class Chp_Array_Ex_6_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[]arr = new double[10];

//        arr[9]= 5.5;
//        arr[0] = 4.5;
//        arr[1] = 9.9;
//        System.out.println(arr[9]);
//        double sum = arr[0] +arr[1];
//        System.out.println(sum);
        //c)
        System.out.println("Enter numbers ");
        for (int i = 0; i <arr.length ; i++) {
              arr[i] = s.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum =sum+ arr[i];
        }
        System.out.println(sum);
    }
}
