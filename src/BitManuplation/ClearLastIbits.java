package BitManuplation;

public class ClearLastIbits {
    public static void main(String[] args) {
        clearLastI(15,3);
        clearLastIRange(10,2,4);
    }

    private static void clearLastIRange(int n, int i, int j) {

        int a = ((-1)<<(j+1));
        int b = (1<<i)-1;
        int mask= a|b;
        System.out.println(mask & n);
    }

    private static void clearLastI(int n, int i) {
        int mask=(-1)<<i;
        System.out.println(mask & n);
    }
}
