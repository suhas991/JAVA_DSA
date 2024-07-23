package ArrayList;

import java.util.ArrayList;

public class TwoDimention {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i);
            list2.add(i+2);
        }
        mainList.add(list1);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            for(int j=0;j<mainList.get(i).size();j++){
                System.out.print((mainList.get(i)).get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainList);

    }

}
