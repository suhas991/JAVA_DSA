package ArrayProblems;

import java.util.Scanner;

public class LinearSearch {
    private static int linearSrch(int[] arr, int k) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,3,9,4,6,7,12,58,62,0};
        System.out.print("Enter the number to search : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int res = linearSrch(arr,k);

        if(res == -1){
            System.out.println("Element not found ");
        }else{
            System.out.println("Element found at index "+ res);
        }
    }
}
