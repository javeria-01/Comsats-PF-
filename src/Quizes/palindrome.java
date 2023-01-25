package Quizes;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = s.next();
        String reverse = "";
        for(int i  =str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Its a palindrome ");
        }
        else{
            System.out.println("Not a palindrome ");
        }
    }
}

