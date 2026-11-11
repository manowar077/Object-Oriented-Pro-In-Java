package Stack;

import java.util.Stack;

public class CheckSortedStack {
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(40);
        st.push(59);
        st.push(20);
        st.push(49);
        IO.println(st);
        sorted(st);
        IO.println(st);
    }
    public static boolean sorted(Stack<Integer> st){
        //base case
        if(st.size()<=1){
            return true;
        }

        //mera work
        int topvalue=st.peek();
        st.pop();
        boolean oneans=(topvalue<=st.peek());

        //recursive call
        boolean recursivkaans=sorted(st);
        //recursion se waqt jo pehle pop kiye the usko add kar dena ha
        st.push(topvalue);
        boolean finalans=oneans&& recursivkaans;
        return finalans;
    }
}
