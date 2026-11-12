package Stack;

import java.util.Stack;

public class ReversePrefixOftheword {
    static void main() {
        String word="abcdefd";
        String ch="d";
        IO.println(reverse(word,ch));;
    }
    public static String reverse(String word,String ch){
        Stack<Character> st = new Stack<>();

        int i = 0;

        // Push characters until first occurrence of ch
        while (i < word.length()) {

            char c = word.charAt(i);
            st.push(c);

            if (String.valueOf(c).equals(ch)) {
                break;
            }

            i++;
        }

        // If ch is not found
        if (i == word.length()) {
            return word;
        }

        StringBuilder ans = new StringBuilder();

        // Pop stack to reverse prefix
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        // Append remaining characters
        ans.append(word.substring(i + 1));

        return ans.toString();


    }
}
