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
        IO.println(st);
        reverse(st);
        IO.println(st);

    }
    public static void InserAtBottom(Stack<Integer> st,int value){
        //base case
        if(st.empty()){
            st.push(value);
            return;
        }

        //1 case main solve karunga baki recursion karega
        int topvalue=st.peek();
        st.pop();
        //recursion call
        InserAtBottom(st,value);
        //wasps push karna ak kar ke
        st.push(topvalue);
    }
    public static void reverse(Stack<Integer> st){
        //base case
        if(st.empty()){
            return;
        }
        //mera case
        int topvalue=st.peek();
        st.pop();
        //baki recursion
        reverse(st);
        //recursion se wapas ate hue koi kaam karna ha
        InserAtBottom(st,topvalue);
    }

}
