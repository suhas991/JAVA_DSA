package SortingTechnique;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr1 = {2,1,5,8,3,0};
        countSrt(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,2,3,5,6,8,9};
        countSrt(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {9,8,7,5,3,2,1,0};
        countSrt(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    private static void countSrt(int[] arr) {

        int largest = Arrays.stream(arr).max().getAsInt();

//        System.out.println(largest);

        int[] count= new int[largest+1];
        for(int i : arr){
           count[i]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] != 0){
                arr[j++]=i;
                count[i]--;
            }
        }


    }
}
