package String;

public class ComparingSting {
    static void main() {
        String str1="manowar";
        String str2="manowar";
        if(str1==str2){
            IO.println("Both String is Equal");
        }
        else{
            IO.println("both string is not equal");
        }

        IO.println(str1.equals(str2)); //case sensitive

        IO.println(str1.equalsIgnoreCase(str2));//no case sensative
    }
}
