package Recursion;




public class CalcPower {

    public static void main(String[] args) {

        System.out.println(calcPower(2,10));
        System.out.println(calcOptiPow(2,10));
    }

    private static int calcPower(int x, int n) {
        if(n==0){
            return 1;
        }

        return x*calcPower(x,n-1);

    }

    private static int calcOptiPow(int x, int n) {
        if(n==0){
            return 1;
        }

        int half = calcOptiPow(x,n/2);
        int opti = half * half;

        if(n%2 == 1){
            opti = opti * x;
        }

        return opti;
    }
}
