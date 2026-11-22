package Stack;

import java.util.Stack;

public class NextSmallerEle {
    public static void main(){
        int[] arr={4, 8, 5, 2, 25};
         int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=n;i<0;i--){
            while(!st.isEmpty() &&  arr[st.peek()] < arr[i]){
              if(st.peek()>arr[i]){
                st.pop();
              }
              else{
                
              }
            }
            st.push(i);
        }
        
    }
}
