package Quizes;
import java.util.Scanner;

public class MultiplyArraywithSmallestNumberInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        modifyArray(arr);
        System.out.println("array after modify");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("" + arr[j]);
        }
    }
    public static void modifyArray(int[] arr) {
        int smallest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest is " + arr[smallest]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[smallest];
        }
    }
}