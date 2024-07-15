package ArrayProblems;

import java.util.Scanner;

public class BinarySearch {

    private static int binary(int[] arr, int k) {

        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(arr[mid] == k){
                return mid;
            }

            if(arr[mid] > k){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {


        int[] arr = {1,2,8,9,10,15,18,20,25,35,45};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to find :");
        int k=sc.nextInt();

        int res = binary(arr,k);

        if(res==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index "+res);
        }

    }


}
