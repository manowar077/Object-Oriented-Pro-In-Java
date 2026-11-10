package Stack;

import java.util.Stack;

public class ReverseStack {
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reverse(st);

    }
    public static void reverse(Stack<Integer> st){
        //base case
        if(st.empty()){
            return;
        }
        //mera case
        int topvalue=st.peek();
        st.pop();
    }
}
