package Backtracking;

import java.util.Arrays;

public class SubsetPrint {
    public static void main(String[] args) {
        String str = "abc";
        printSubstring(str,"",0);

    }

    private static void printSubstring(String str, String s, int i) {
        if(i == str.length()){
            if(s.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(s);
            }

            return;
        }

        //yes
        printSubstring(str,s+str.charAt(i),i+1);
        //no
        printSubstring(str,s,i+1);
    }
}
