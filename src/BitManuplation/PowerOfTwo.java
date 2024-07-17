package BitManuplation;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerofTwo(10));
        System.out.println(powerofTwo(8));
        System.out.println(powerofTwo(16));
        System.out.println(powerofTwo(23));
    }

    private static String powerofTwo(int n) {
        return (n & (n-1))==0? "yes" : "no";
    }
}
