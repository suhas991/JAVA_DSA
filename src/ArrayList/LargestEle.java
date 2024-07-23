package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LargestEle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(61);
        list.add(72);
        list.add(23);
        list.add(457);
        list.add(51);

        int max = Integer.MIN_VALUE;

        for(Integer i : list){
            if(i > max){
                max=i;
            }
        }
        System.out.println("Max val = "+max);


        //swap numbers based on index
        System.out.println(list);
        swapElement(list,1,3);
        System.out.println(list);

        //Sorting array list
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }

    private static void swapElement(ArrayList<Integer> list, int id1, int id2) {

        int temp = list.get(id1);
        list.set(id1,list.get(id2));
        list.set(id2,temp);

    }
}
