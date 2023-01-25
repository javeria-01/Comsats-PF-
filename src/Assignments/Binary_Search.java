package Assignments;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your element! ");
        int element = s.nextInt();
        int[] arr = {13,10,14,15,10,37,25};
        int start = 0;
        int end  = arr.length-1;
        boolean not_found = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(element>arr[mid]){
                start = mid+1;
            }
            else if (arr[mid]==element) {
                not_found = true;
                System.out.println("Element is found on index "+mid);
                break;
            }
            else{
                end = mid -1;
            }
        }
        if(!not_found){
            System.out.println("Sorry this element is not found! ");
        }
    }
}
