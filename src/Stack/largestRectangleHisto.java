package Stack;

import java.util.Stack;

public class largestRectangleHisto {
    public static void main(){
         int[] arr = {4, 8, 5, 2, 25};

        int n = arr.length;
         int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        //previous smaller element
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }

            st.push(i);
        }

        //next smaller element
        for(int i=n-1;i<=0;i--){
            while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }

            st.push(i);
        }

        //area calculation
        int maxarea=0;

        for(int i=0;i<n;i++){
           int width=pse[i]-nse[i];
        }




    }
}
