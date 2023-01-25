package Terminal_practise;

import java.util.Scanner;

public class Throw_Throwss {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = s.nextInt();
        if(num<=50){
            throw new Exception("you fail this course ");
        }
        else{
            System.out.println("You pass this course ");
        }
    }
}
