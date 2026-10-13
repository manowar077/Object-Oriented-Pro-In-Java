package HashMap;

import java.util.HashMap;

public class first_pro {
    static void main() {
        String str="banana";
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0));

        }
        IO.println(freq);
    }
}
