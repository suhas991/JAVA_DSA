package TwoDimarrayProb;

import java.util.Arrays;

public class DiagnalsSum {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(DiagnolSum(arr));

        int[][] arr1 = {{1,2,3},{5,6,7},{9,10,11}};
        for(int i=0;i< arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println(DiagnolSum(arr1));

    }

    private static int DiagnolSum(int[][] arr) {

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            //i==j cond
            sum += arr[i][i];

            //i+j = n-1 cond
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-i-1];
            }

        }
        return sum;
    }
}
