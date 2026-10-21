package String;
import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Uppercase to lowercase
                str.setCharAt(i, (char)(ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                // Lowercase to uppercase
                str.setCharAt(i, (char)(ch - 32));
            }
        }

        System.out.println(str);
        sc.close();
    }
}
