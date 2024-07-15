package MathProb;

public class BinaryToDecimal {

    public static void DecBin(int n){

        int sample = n;
        int dec=0;
        int pow=0;

        while(sample > 0){
            dec += ((sample%10)* Math.pow(2,pow));
            sample /= 10;
            pow++;
        }

        System.out.println(dec);
    }

    public static void main(String[] args) {

        DecBin(101101);

    }
}
