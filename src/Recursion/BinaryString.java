package Recursion;

public class BinaryString {
    public static void main(String[] args) {
        String str = "";
        printBinaryString(4,0,str);
    }

    private static void printBinaryString(int n, int lastOccur, String str) {
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinaryString(n-1,0,str+"0");
        if(lastOccur == 0){
            printBinaryString(n-1,1,str+"1");
        }

    }
}
