package Stack;
import java.util.Stack;

public class stackdemo {
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        IO.println(st.peek());
    }
}
