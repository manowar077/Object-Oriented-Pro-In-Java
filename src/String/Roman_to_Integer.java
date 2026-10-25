package String;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    static int main() {
        String s="manowar";
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                total -= values.get(s.charAt(i));
            } else {
                total += values.get(s.charAt(i));
            }
        }


        return total;
    }
}
