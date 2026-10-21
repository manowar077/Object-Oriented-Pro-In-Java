
package String;

import java.util.Arrays;

public class CompleteFunctions {

    public static void main(String[] args) {

        String str = "Hello Java World";
        String s = "hello java world";
        String name = "  Manowar Alam  ";
        String word = "Java";

        // 1. Length and character access
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("First character: " + str.charAt(0));

        // 2. Change case
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // 3. Remove spaces
        System.out.println("Trim: '" + name.trim() + "'");
        System.out.println("Strip: '" + name.strip() + "'");

        // 4. Search operations
        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.contains("World"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));

        // 5. Compare strings
        System.out.println(str.equals(s));
        System.out.println(str.equalsIgnoreCase(s));
        System.out.println(str.compareTo(s));

        // 6. Extract a substring
        System.out.println(str.substring(6));
        System.out.println(str.substring(6, 10));

        // 7. Replace characters and text
        System.out.println(str.replace("Java", "Python"));
        System.out.println("banana".replace('a', 'o'));
        System.out.println("a1b2c3".replaceAll("\\d", "*"));
        System.out.println("a1b2c3".replaceFirst("\\d", "*"));

        // 8. Split a string
        String data = "Java,Python,C++";
        String[] languages = data.split(",");
        System.out.println(Arrays.toString(languages));

        // 9. Join strings
        System.out.println(String.join(" - ", languages));

        // 10. Check empty and blank strings
        System.out.println("".isEmpty());
        System.out.println("   ".isBlank()); // Java 11+

        // 11. Convert to char array
        char[] chars = word.toCharArray();
        System.out.println(Arrays.toString(chars));

        // 12. Convert between String and other types
        int number = Integer.parseInt("123");
        System.out.println(number + 10);
        System.out.println(String.valueOf(123.45));

        // 13. Concatenation and repetition
        System.out.println("Hello".concat(" World"));
        System.out.println("Hi ".repeat(3)); // Java 11+

        // 14. Check content
        System.out.println(str.matches(".*Java.*"));
        System.out.println("12345".matches("\\d+"));

        // 15. String formatting
        String result = String.format("Name: %s, Age: %d", "Ali", 21);
        System.out.println(result);

        // 16. String literals and intern()
        String a = new String("Java");
        String b = a.intern();
        System.out.println(b);

        // 17. Count lines (Java 11+)
        String multiline = "Java\nPython\nC++";
        System.out.println(multiline.lines().count());

        // 18. Compare with StringBuilder
        System.out.println("Java".contentEquals(new StringBuilder("java")));

        // 19. Check prefix at a particular position
        System.out.println("Hello Java".startsWith("Java", 6));

        // 20. Get bytes
        byte[] bytes = "ABC".getBytes(
                java.nio.charset.StandardCharsets.UTF_8
        );
        System.out.println(Arrays.toString(bytes));
    }
}
