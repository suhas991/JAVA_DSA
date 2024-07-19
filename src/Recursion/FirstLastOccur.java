package Recursion;

public class FirstLastOccur {
    public static void main(String[] args) {
        int[] arr1={1,25,82,35,5,6,7,53,25,90};
        System.out.println("At index "+firstOccur(arr1,0,35));

        System.out.println("At index "+lastOccur(arr1,arr1.length-1,25));
    }

    private static int firstOccur(int[] arr, int i, int key) {
        if(i == arr.length-1){
            return -1;
        }

        if(key == arr[i]){
            return i;
        }

        return firstOccur(arr,i+1,key);

    }

    private static int lastOccur(int[] arr, int i, int key) {
        if(i < 0){
            return -1;
        }

        if(key == arr[i]){
            return i;
        }

        return lastOccur(arr,i-1,key);
    }
}
