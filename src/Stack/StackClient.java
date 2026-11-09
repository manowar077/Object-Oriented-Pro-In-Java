package Stack;

import java.util.Stack;

public class StackClient {
    static void main() throws Exception {
        StackImplementation st=new StackImplementation();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        IO.println(st.isfull());
        IO.println(st.isEmpty());
        st.push(60);
    }
}
