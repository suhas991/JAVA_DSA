package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TargetPairSum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);

        System.out.println(targetSum(list,0,list.size()-1, 12));
        System.out.println(targetSum(list,0,list.size()-1, 22));
        System.out.println(targetSum(list,0,list.size()-1, 5));

    }

    private static boolean targetSum(ArrayList<Integer> list, int lp, int rp,int target) {

        while(lp < rp){
          if((list.get(lp)+list.get(rp)) == target){
              return true;
          }
          if((list.get(lp)+list.get(rp)) < target){
              lp++;
          }else{
              rp--;
          }
        }

        return false;
    }
}
