package Stack;

import java.util.Stack;

public class validParan {
    static void main() {
        String value="({})[]";

        Stack<String> st=new Stack<>();

        for(char ch:value.toCharArray()){
            if(ch=='(' ||ch=='{'||ch=='['){
                st.push(String.valueOf(ch));

            }
            else {
                if(st.empty()){
                    return false;
                }

                if(ch==')'&&st.peek()=="("){
                    return false;
                }
                else if(ch=='}'&&st.peek()=="{"){
                    return false;
                }
                else if(ch==']'&&st.peek()== "["){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
