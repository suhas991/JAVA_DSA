package ArrayList;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //add a specific index
        list.add(3,10);
        System.out.println(list);

        //get element
        System.out.println(list.get(3));

        //remove element
        list.remove(4);
        System.out.println(list);

        //set element
        list.set(4,8);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(10));

        //size() just like length for array
        System.out.println(list.size());

        //print array
        for(Integer i : list){
            System.out.print(i+ " ");
        }
        System.out.println();


        //print reverse of array
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }
}
