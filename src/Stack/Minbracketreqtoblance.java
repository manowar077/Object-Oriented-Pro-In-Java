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
            if(ch=='}'&& !st.)
        }

    }
}
