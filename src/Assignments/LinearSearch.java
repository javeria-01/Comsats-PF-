package Assignments;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {13,10,14,15,10,37,25};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Element ");
        int element = s.nextInt();
        boolean not_found = false;
        for(int i = 0; i< arr.length; i++) {
            if (element == arr[i]) {
                System.out.println("Element is found on index " + i);
                not_found = true;
                break;
            }
        }
              if(!not_found){
                  System.out.println("Sorry dont found an element! ");
              }
        }
    }

