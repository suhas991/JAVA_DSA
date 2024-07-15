package TwoDimarrayProb;

import java.util.Arrays;

public class SearchElement {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(Search(arr,0));

        int[][] arr1 = {{1,2,3},{5,6,7},{9,10,11},{12,13,14}};
        for(int i=0;i< arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println(Search(arr1,12));

    }

    private static boolean Search(int[][] arr, int k) {

        int j=arr[0].length-1;
        int i=0;

       while(i<arr.length && j >=0){

                if(arr[i][j]==k){
                    System.out.println("found at index ("+i+","+j+")");
                    return true;
                }

                if(arr[i][j] > k)
                    j--;
                else
                    i++;
            }

        return false;
    }
}
