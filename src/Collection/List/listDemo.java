package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class listDemo {
    static void main() {
        List<String> users =new ArrayList<>();
        users.add("Alice");
        users.add("Bobby");
        users.add("AAHANA");
        users.add("SHAMIA");
      //  users.add(1234);
        IO.println("All User");
        for(String user:users){
            IO.println(user);
        }

        IO.println("Element using index :"+ users.get(0));
    }

}
