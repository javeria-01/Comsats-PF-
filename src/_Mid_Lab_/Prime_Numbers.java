package _Mid_Lab_;
import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to print its prime numbers: ");
        int number = sc.nextInt();
        primeNumbers(number);
    }
    public static void primeNumbers(int tableVictim){
        for (int i = 1; i <=tableVictim ; i++) {
            if(getPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean getPrimeNumber(int number){
        if (number == 2 || number==1) {
            return true;
        }else{
            for (int i = 2; i <number/2 ; i++) {
                if(number%i==0){
                    return false;

                }

            }
        }
        return true;
    }
}

