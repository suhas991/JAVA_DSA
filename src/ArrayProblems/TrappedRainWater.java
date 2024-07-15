package ArrayProblems;

import java.util.*;

public class TrappedRainWater {

    public static void main(String[] args) {
        int[] arr1 = {4,2,0,6,3,2,5}; //11
        int[] arr2 = {3, 0, 1, 0, 4, 0, 2}; //10
        int[] arr3 = {3, 0, 2, 0, 4}; // 7
        int res = trappedWaterAuxi(arr1);
        System.out.println(res);

        res = trappedWaterAuxi(arr2);
        System.out.println(res);

        res = trappedWaterAuxi(arr3);
        System.out.println(res);
    }

    private static int trappedWaterAuxi(int[] arr) {

        int[] leftB=new int[arr.length];
        int[] rightB=new int[arr.length];

        int lMax=0;
        for(int i=0;i<leftB.length;i++){
            if(lMax < arr[i]){
                lMax=arr[i];
            }
            leftB[i]=lMax;
        }
        System.out.println(Arrays.toString(leftB));

        int RMax=0;
        for(int i=arr.length-1;i>=0;i--){
            if(RMax < arr[i]){
                RMax=arr[i];
            }
            rightB[i]=RMax;
        }
        System.out.println(Arrays.toString(rightB));

        int res=0;
        int width = 1;

        for(int i=0;i<arr.length;i++){
            res += (Math.min(leftB[i],rightB[i]) - arr[i] ) * width ;
        }

        return res;
    }
}
