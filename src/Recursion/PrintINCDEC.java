package Recursion;

public class PrintINCDEC {

    private static void printDec(int i) {
        if(i==1){
            System.out.print(i+" ");
            return;
        }
        System.out.print(i+" ");
        printDec(i-1);
    }


    private static void printInc(int i) {
        if(i==1){
            System.out.print(i+" ");
            return;
        }
        printInc(i-1);
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        printInc(10);
        System.out.println();
        printDec(10);
    }
}
