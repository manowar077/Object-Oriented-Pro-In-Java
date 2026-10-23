
package String;

import java.util.HashMap;

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS.containsKey(a)) {
                if (mapS.get(a) != b) {
                    return false;
                }
            }

            if (mapT.containsKey(b)) {
                if (mapT.get(b) != a) {
                    return false;
                }
            }

            mapS.put(a, b);
            mapT.put(b, a);
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "silent";
        String t = "listen";

        boolean result = isIsomorphic(s, t);

        System.out.println(result);
    }
}
