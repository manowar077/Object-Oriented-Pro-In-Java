package String;

public class Frequency_count {
    static void main() {
        String str="banana";
        int[] freq= new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch -'a']++;

        }

        for(int i=0;i<26;i++){
        }
    }
}
