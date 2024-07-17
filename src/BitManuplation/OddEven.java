package BitManuplation;

public class OddEven {
    public static void check(int n){

        int bitMask = 1;
        if((bitMask & n) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {

        check(5);
        check(11);
        check(18);
        check(2);
    }
}
