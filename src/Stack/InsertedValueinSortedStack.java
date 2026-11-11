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
        //base case
        if(st.empty()){
            st.push(value);
            return;
        }

        //mera case
        int topvalue=st.peek();
        //baki recursion sambhal lega
        if(topvalue<value){
            st.pop();
            insertsort(st,value);
            st.push(topvalue);
        }
        else{
            st.push(value);
            return;
        }
        // recursive se ate kuch kaam kar leta ha


    }
}
