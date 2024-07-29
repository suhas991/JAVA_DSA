package StackProb;

import java.util.Stack;

public class RevString {

    private static String revString(String str) {

        Stack<Character> st = new Stack<>();

        int idx=0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String str = "HelloWorld";
        String res = revString(str);
        System.out.println(res);

        String str1 = "Hello_ World     ";
        String res1 = revString(str1);
        System.out.println(res1);
    }
}
