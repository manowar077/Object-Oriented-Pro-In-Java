package Stack;

import java.util.Stack;

public class InsertedValueinSortedStack {
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int value=55;
        insertsort(st,value);
        IO.println(st);
    }
    public static void insertsort(Stack<Integer> st,int value){
        int topvalue=st.peek();
        if(st.peek()<value){
            st.push(value);
        }
        //st.push(topvalue);
    }
}
