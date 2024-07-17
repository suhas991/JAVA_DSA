package BitManuplation;

public class CountSetBits {
    public static void main(String[] args) {
        checkSet(15);
    }

    private static void checkSet(int n) {
        int count=0;

        while(n!=0){

            if((n & 1) != 0)
                count++;

            n=n>>1;
        }

        System.out.println("total set bits are "+count);
    }
}
