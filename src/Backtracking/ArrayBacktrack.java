package Backtracking;

import java.util.Arrays;

public class ArrayBacktrack {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        backclac(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    private static void backclac(int[] arr,int i,int val) {
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i]=val;
        backclac(arr,i+1,val+1);
        arr[i]=arr[i]*2;

    }
}
