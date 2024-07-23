package ArrayList;

import java.util.ArrayList;

public class WaterContainerMost {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);

        int max = Integer.MIN_VALUE;

        // Brute Force Solution
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                max= Math.max(max,((j-i)*Math.min(arr.get(i),arr.get(j))));
            }
        }

        System.out.println(max);

        max=Integer.MIN_VALUE;

        //Optimised Linear Solution
        int lp = 0;
        int rp = arr.size()-1;

        while(lp < rp ){
            // max ( max , (height * width ) ) width = rp - lp height = min (lp , rp )
            max= Math.max(max,((rp-lp)*Math.min(arr.get(lp),arr.get(rp))));

            if(arr.get(lp) < arr.get(rp)){
                lp++;
            }else{
                rp--;
            }

        }
        System.out.println(max);



    }
}
