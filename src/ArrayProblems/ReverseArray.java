package ArrayProblems;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {

        int l=0;
        int r=arr.length-1;

        while(l<r){

            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;

            l++;
            r--;
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,8,6,5,8};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}
