package Recursion;

public class TilingProb {
    public static void main(String[] args) {

        System.out.println("Total ways are "+tilingCount(4));

    }

    private static int tilingCount(int n) {

        if(n == 0 || n==1){
            return 1;
        }

        int totalways = tilingCount(n-1) + tilingCount(n-2);

        return totalways;
    }
}
