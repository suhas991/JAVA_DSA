package BitManuplation;

public class FastExpo {
    public static void main(String[] args) {
        calcPow(3,5);
        calcPow(2,5);
        calcPow(0,5);
    }

    private static void calcPow(int x, int n) {
        int ans=1;

        while(n>0){
            if((n & 1) == 1){
                ans *= x;
            }
            x=x*x;
            n=n>>1;
        }

        System.out.println(ans);

    }
}
