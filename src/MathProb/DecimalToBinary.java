package MathProb;

public class DecimalToBinary {

    public static void BinDec(int n){

        int sample=n;
        int bin= 0;
        int pow=0;

        while(sample > 0){

            int rem = sample % 2;

            bin = bin + ( rem *(int)(Math.pow(10,pow++)));

            sample /= 2;

        }

        System.out.println(bin);
    }

    public static void main(String[] args) {
        BinDec(10);
    }
}
