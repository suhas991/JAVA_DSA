package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    private static int sum(int n) {
        if(n==1){
            System.out.print(n+" ");
            return 1;
        }
        System.out.print(n+" ");
        return n+sum(n-1);
    }
}
