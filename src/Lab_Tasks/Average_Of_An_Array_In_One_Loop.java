package Lab_Tasks;

import java.util.Scanner;

public class Average_Of_An_Array_In_One_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Enter array element: ");
        for(int i=0;i<5; i++){
            array [i] = input.nextInt();

        }
        System.out.println("sum of the given array is " +sum(array));
    }

    public static int sum(int [] arr) {
        int s= 0;
        for(int x:arr)
            s= x;
        return s;

    }
}


