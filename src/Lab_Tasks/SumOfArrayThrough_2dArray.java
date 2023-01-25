package Lab_Tasks;
import java.util.Scanner;

public class SumOfArrayThrough_2dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter elements of row array # " + (i + 1));
            for (int j = 0; j < 4; j++)
                arr[i][j] = s.nextInt();
            }
            System.out.println("The given 2d array is....");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++)
                    System.out.println(arr[i][j] + "\t");
                System.out.println();
            }
            int sum;
            for (int i = 0; i < 3; i++) {
                sum = 0;
                for (int j = 0; j < 4; j++)
                    sum += arr[i][j];
                System.out.println("Sum of row " + (i + 1) + "is" + sum);
            }
        }
    }

