package String;

import java.util.Scanner;

public class inputString {
    static void main() {
        Scanner sc =new Scanner(System.in);
        IO.println("provide the string content :");
        String str= sc.nextLine();//taking whole sentence
        IO.println("value of next line :"+str);


        IO.println("provide the string content :");
        String str2= sc.next();  //taking first word before space
        IO.println("value of next line :"+str2);

    }
}
