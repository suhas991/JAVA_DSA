package ArrayProblems;

import java.util.Scanner;

public class LargestInArray {
    private static int Largest(int[] arr) {

        if(arr.length == 0){
            return 0;
        }

        int smallest =Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        System.out.println("Smallest in the given array is : "+ smallest);

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {100,8,3,9,4,6,7,12,-5,62,-458};

        int res = Largest(arr);

        System.out.print("Largest in the given array is : ");
        System.out.println(res);

        }
}
