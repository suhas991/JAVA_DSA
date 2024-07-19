package Recursion;

public class PairPerson {
    public static void main(String[] args) {
        System.out.println("total ways are "+calcpair(4));
    }

    private static int calcpair(int n) {
        if(n==1 || n==2){
            return n;
        }

        return calcpair(n-1) + (n-1) * calcpair(n-2);
    }
}
