package Stack;

import java.util.Stack;

public class Minbracketreqtoblance {
    static int main() {
        Stack<Character> st =new Stack<>();
        String str="{{{{}}}}";
        //if length is odd ans is impossible
        if(str.length()%2==1){
            return -1;
        }
        //removing all valid brackets pairs and keeping all the  unmatched brackets inside the stack only
        for(char ch:str.toCharArray()){
            //cancel out logic
            if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        //count open and close brackets
        int open=0;
        int close=0;
        while(!st.isEmpty()){
            if(st.peek()=='{'){
                open++;
            }
            else{
                close++;
            }
            st.pop();
        }
        //find the total no of reversal required
        //even
        if(open%2==0){
           return (open/2)+(close/2);
        }
        else{
            //odd
            return (close-1)/2+2+(open-1)/2;
        }

    }
}
