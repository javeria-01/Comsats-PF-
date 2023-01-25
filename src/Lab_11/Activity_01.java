package Lab_11;
import java.util.Objects;
import java.util.Scanner;

public class Activity_01 {
    public class Choose_Arithmatics_Exceptions {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String choice;
            do {
                System.out.println("Enter value of num 1: ");
                int num1 = s.nextInt();
                System.out.println("Enter value of num 2: ");
                int num2 = s.nextInt();
                System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
                System.out.println("Enter your choice ");
                choice = s.next();
                try {
                    switch (choice) {
                        case "+":
                            System.out.println(num1 + num2);
                            break;
                        case "-":
                            System.out.println(num1 - num2);
                            break;
                        case "*":
                            System.out.println(num1 * num2);
                            break;
                        case "/":
                            System.out.println(num1 / num2);
                            break;
                        default:
                            System.out.println("This opeartion is out of reached");
                    }
                } catch (Exception e) {
                    System.out.println("Division cannot be done by zero ");
                    System.out.println("Try again ");
                }
            }
            while (!Objects.equals(choice, "5"));
        }
    }












}
