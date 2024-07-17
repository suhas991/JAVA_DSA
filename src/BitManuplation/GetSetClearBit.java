package BitManuplation;

import java.sql.SQLOutput;

public class GetSetClearBit {

    public static void main(String[] args) {

        System.out.println(getIbit(10,1));
        System.out.println(setIbit(0,2));
        System.out.println(clearIbit(10,1));

    }

    private static int clearIbit(int n, int i) {
        int mask=~(1<<i);
        return (mask & n);
    }

    private static int setIbit(int n, int i) {
        int mask = 1<<i;
        return (mask | n);

    }

    private static int getIbit(int n, int i) {
        int mask=1<<i;

        if((mask & n) == 0){
            return 0;
        }else{
            return 1;
        }

    }
}
