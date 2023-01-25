package Assignments;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {13,10,14,15,10,37,25};
        int index =0;
        for(int i=0; i< arr.length; i++){
            int smallest = arr[i];
            for(int j=i; j< arr.length; j++){
                if(arr[j]<=smallest){
                    index =j;
                    smallest =arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

