package Lab_11;
import java.util.Scanner;
public class Factorial {

    public class Factorial_Using_Exception_Handling {
        public static void main(String[] args) {
            while (true)
                try {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter your number ");
                    int num = s.nextInt();
                    fact(num);
                    break;
                } catch (Exception e) {
                    System.out.println("");
                }
        }
        private static void fact(int num) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
