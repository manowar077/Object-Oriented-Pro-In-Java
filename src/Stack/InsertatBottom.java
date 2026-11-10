package Stack;
import java.util.*;

public class InsertatBottom {
    static void main() {
          Stack<Integer> st=new Stack<>();
          st.push(10);
          st.push(20);
          st.push(30);
          st.push(40);
          int value=55;
          InserAtBottom(st,value);
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
}
