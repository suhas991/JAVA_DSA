package Backtracking;

public class PermutationPrint {
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str,"");
    }

    private static void printPerm(String str, String res) {
        if(str.length() == 0){
            System.out.println(res);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,res+ch);

        }

    }
}
