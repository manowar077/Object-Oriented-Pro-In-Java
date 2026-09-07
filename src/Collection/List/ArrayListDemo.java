package Collection.List;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        System.out.println(list.size());
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        IO.println(list);
        list.add(2,-6);
        IO.println(list);

        //GEt
        IO.println(list.get(4));

        //Set method
        list.set(3,90);
        IO.println(list);

        //remove
        list.remove(2);
        IO.println(list);
        for(int i=0;i<list.size();i++){
            IO.println(list.get(i)+ " ");
        }
        for(int v:list){
            IO.println(v+" ");
        }

    }
}