package Stack;
import java.util.*;

import java.util.ArrayDeque;

public class MiddleElement {

    static  void main() {
        Deque<Integer> st= new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int count=0;
        int size=st.size();

        printmiddleelement(st,size,count);
    }

    public static void printmiddleelement(Deque<Integer> st,int size,int count){
        //base case
        if(count==size/2){
            int middleelement=st.peek();
            IO.println(middleelement);
        }


    }
}
