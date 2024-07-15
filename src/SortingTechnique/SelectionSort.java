package SortingTechnique;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {2,1,5,8,3,0};
        Selection(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,2,3,5,6,8,9,-5};
        Selection(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {9,8,7,5,3,2,1,0};
        Selection(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    private static void Selection(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int t=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=t;
        }
    }
}
