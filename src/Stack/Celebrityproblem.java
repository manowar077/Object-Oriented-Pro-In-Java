package Stack;
import java.util.Stack;

public class Celebrityproblem {
    public static void main(String[] args) {
       int mat[][] = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};

        System.out.println(findCelebrity(mat));
    }

    public static int findCelebrity(int[][] mat) {
        int n = mat.length;

        Stack<Integer> st = new Stack<>();

        //push all element
        for(int i=0;i<n;i++){
            st.push(i);
        }

        //elemante non cleb
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();

            if(mat[a][b]==1){
                st.push(b);
            }
            else{
                st.push(a);
            }

        }

        //possible celeb
        int candidate=st.pop();

        //verify candidate
        for(int i=0;i<n;i++){
            if(i==candidate){
                continue;
            }
            if(mat[candidate][i]==1 || mat[i][candidate]==0){
                return -1;
            }
        }
        return candidate;
    }
}