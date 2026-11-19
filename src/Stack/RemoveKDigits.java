package Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class RemoveKDigits {
   public static void main(String[] args) {
      String num = "1432219";
      int k = 3;
      remove(num,k);
    }
    static void remove(String num,int k){
        Deque<Character> st=new ArrayDeque<>();
        
        //apply monotanic stack pattern on input string 
        for(char ch:num.toCharArray()){
            while(!st.isEmpty()&& k>0 && st.peek()>ch){
                st.pop();
                k--;
            }

            //insert the curreent char
            st.push(ch);
        }

    }

}