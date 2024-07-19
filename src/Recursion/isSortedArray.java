package Recursion;

public class isSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr1={1,25,28,35,5,6,7};

        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr1,0));
    }

    private static boolean isSorted(int[] arr,int i) {
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }
}
