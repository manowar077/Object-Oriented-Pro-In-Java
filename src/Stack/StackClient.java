package Stack;

import java.util.Stack;

public class StackClient {
    static void main() throws Exception {
        StackImplementation st=new StackImplementation();
        try{

            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            IO.println(st.isfull());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            IO.println(st.isfull());
        }
    }
}
