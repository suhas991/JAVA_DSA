package StackProb;

import java.util.Stack;

public class RevStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        revStack(st);
        System.out.println(st);
    }

    private static void revStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        revStack(st);
        addBottam(st,top);
    }

    private static void addBottam(Stack<Integer> st, int top) {
        if(st.isEmpty()){
            st.push(top);
            return;
        }

        int tp = st.pop();
        addBottam(st,top);
        st.push(tp);
    }
}
