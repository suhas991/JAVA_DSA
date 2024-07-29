package StackProb;

import java.util.Stack;

public class PushBottom {

    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();


        s.push(1);
        s.push(2);
        s.push(3);

        addBottom(s,4);
        System.out.println(s);

        addBottom(s,5);
        System.out.println(s);


    }

    private static void addBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        addBottom(s,data);
        s.push(top);
    }
}
