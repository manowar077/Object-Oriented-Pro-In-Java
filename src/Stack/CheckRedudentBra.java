
package Stack;

import java.util.Stack;

public class CheckRedudentBra {

    public static void main(String[] args) {

        String str = "((a+b))";

        System.out.println(Redundent(str));
    }

    public static boolean Redundent(String str) {

        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(') {
                st.push(ch);
            }

            // Operators
            else if (ch == '+' || ch == '-' ||
                    ch == '*' || ch == '/') {
                st.push(ch);
            }
            //closing
            else if(ch==')'){
                //main logic
                //jab tak mujhe stack me is closing bracket kacoresponding opening baracket nahi milege tab tak
                //main stack me se element pop karata rahunga
                //and track rakhung ki koi operator beech me mila ya nahi
                boolean operaterfound=false;
                while(!st.isEmpty()){
                    char temp=st.peek();
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/'){
                        operaterfound=true;
                    }
                    if(ch==')'&&temp=='('){
                        st.pop();
                        break;
                    }

                    st.pop();

                }
                if(operaterfound==false){
                    return true;
                }
            }


        }

        return false;
    }
}
