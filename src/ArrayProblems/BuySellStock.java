package ArrayProblems;

public class BuySellStock {

    public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6,4};
        int res = maxProfit(arr1);
        System.out.println(res);

        int[] arr2 ={7, 6, 4, 3, 1};
        res = maxProfit(arr2);
        System.out.println(res);
    }

    private static int maxProfit(int[] arr1) {

        int profit = 0;
        int buy=arr1[0];

        for(int i=1;i<arr1.length;i++){

            buy = Math.min(arr1[i],buy);

            if((arr1[i]-buy) > profit){
                profit=Math.max(profit,(arr1[i]-buy));
            }

        }

        return profit;
    }
}
