package BitManuplation;

public class BitOperation {

    public static void main(String[] args) {

        System.out.println((5 & 6));
        System.out.println((5 | 6));
        System.out.println(5 ^ 6);
        System.out.println(~0);
        System.out.println(5 << 2); // a << b = a * 2^b
        System.out.println(20 >> 2); // a >> b = a / 2^b
    }
}
