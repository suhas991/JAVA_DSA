package SortingTechnique;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {2,1,5,8,3,0};
        bubbleSrt(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,2,3,5,6,8,9};
        bubbleSrt(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {9,8,7,5,3,2,1,0};
        bubbleSrt(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    private static void bubbleSrt(int[] arr1) {

        boolean change = false;

        for(int i=0;i<arr1.length-1;i++) {

            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    change = true;
                    int t = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = t;
                }
            }

            if (change == false) {
                break;
            }
        }

    }
}
