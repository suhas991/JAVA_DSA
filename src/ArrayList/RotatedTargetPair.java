package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RotatedTargetPair {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,12,15,2,3,4,5,6,7,8);
        System.out.println(list);

        System.out.println(pairTarget(list,5));

    }

    private static boolean pairTarget(ArrayList<Integer> list, int target) {

        int n=list.size();
        int lp = 0;
        int rp = 0;
        for(int i=0;i<n;i++){
            if(list.get(i) > list.get(i+1)){
                lp=i+1;
                rp=i;
                break;
            }
        }

        while(lp != rp){

            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }
            if((list.get(lp) + list.get(rp)) > target){
                rp = (n+rp-1) % n;
            }else{
                lp = (lp+1) % n;
            }
        }

        return false;
    }
}
