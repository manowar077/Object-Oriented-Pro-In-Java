package Stack;

import java.util.Stack;

public class CheckRedudentBra {
    static void main() {
        //find faltu ka bracket


        String str="((a+b))";
        Redundent(str);

    }
    public static void Redundent(String str){
        Stack<String> st=new Stack<>();
        for(char ch=str.toCharArray()){

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {

                st.push(String.valueOf(ch));
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                st.push(String.valueOf(ch));

            }
            else if(ch==')'||ch=='}'||ch==']'){
                //main logic
                //jab tak mujhe stack me is clasing bracket
                //corresponding opening bracket nahi milega tab tak track rakhung
                boolean operatorfound=false;
                while(!st.isEmpty()){
                    char temp=st.peek();
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/'){
                        operatorfound=true;
                    }
                }
            }

        }
    }
}
