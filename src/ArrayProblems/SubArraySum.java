package ArrayProblems;

public class SubArraySum {

    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr1 = {3, 4, 2, 3, 1, 7, 5};
        maxSubarray(arr);
        minSubarray(arr1);

    }

    private static void maxSubarray(int[] arr) {

        int maxi=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){

            sum += arr[i];

            if(sum < 0){
                sum =0;
            }

            if(sum > maxi){
                maxi = sum;
            }

        }

        System.out.println(maxi);
    }

    private static void minSubarray(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){


            if(sum > 0){
                sum=arr[i];
            }else{
                sum += arr[i];
            }

            if(sum < min){
                min = sum;
            }

        }

        System.out.println(min);
    }
}
