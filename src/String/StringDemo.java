package String;

public class StringDemo {

    static void main() {
        String str="hello";
        IO.println(str);
        String str1=new String("hello");
        IO.println(str1);
        String s="manowar alam";
        IO.println(s.substring(0,4)); //loops run till 3(start,end)
    }
}
