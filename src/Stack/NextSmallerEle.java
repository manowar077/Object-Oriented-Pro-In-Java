package Stack;

import java.util.Stack;

public class NextSmallerEle {
    public static void main(){
        int[] arr={4, 8, 5, 2, 25};
         int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() &&  arr[st.peek()] < arr[i]){
              st.pop();
            }
         // If stack is empty, no smaller element exists
            //ab sara useless element pop hogaya hoge 
            //ans stack ya to empty hogaya hoga
            //ya fir stack k tap per ek useful element hoga
            if(st.isEmpty()){
                result[i]=-1;

            }
            else{
                // Top of stack is the next smaller element
                result[i] = st.peek();
            }
        }
        
    }
}
