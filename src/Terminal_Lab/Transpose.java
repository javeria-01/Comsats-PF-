package Terminal_Lab;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter total rows and columns: ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for(i = 0; i < row; i++) {
            for(j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("Before transpose ");
        for(i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("\nThe above matrix after Transpose is ");
        transpose(row, column, array);

    }
    private static void transpose(int row, int column, int[][] array) {
        int i;
        int j;
        for(i = 0; i < column; i++) {
            for(j = 0; j < row; j++) {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}

