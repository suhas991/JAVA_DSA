package SortingTechnique;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {2,1,5,8,3,0};
        Insert(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,2,3,5,6,8,9,-5};
        Insert(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {9,8,7,5,3,2,1,0};
        Insert(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    private static void Insert(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev=i-1;

            while(prev >=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }
}
