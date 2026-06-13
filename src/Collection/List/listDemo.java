package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class listDemo {
    static void main() {
        List users =new ArrayList<>();
        users.add("Alice");
        users.add("Bobby");
        users.add("AAHANA");
        users.add("SHAMIA");
        IO.println("All User");
        for(Object user:users){
            IO.println(user);
        }
    }

}
