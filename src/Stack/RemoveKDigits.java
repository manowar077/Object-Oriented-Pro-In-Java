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
        //step2: agar kuch removals still pending h to take care of it
        while(k>0&& !st.isEmpty()){
            st.pop();
            k--;
        }

        //step 3: build your string reverse it.
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        //ans reverse karna ha
        ans.reverse();

        //remove leading zeros
        int index=0;
        while(index<ans.length()&& ans.charAt(index)=='0'){
             index++;
        }
        String result=ans.substring(index);

    }

}