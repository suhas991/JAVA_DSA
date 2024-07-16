package StringsProb;

public class PalindromeProb {
    public static void main(String[] args) {
        String str = "madam";
        boolean val = false;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                val = true;
            }
        }

        System.out.println(val ? "Not pali" : "Palindrome ");



    }
}
