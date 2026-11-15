package OOPs.Inheritence;

public class student_client {
    static void main() {
        Student s=new Student();
        String s1="Hellow";
        IO.println(s1);
        IO.println(s);
    }
    public static class Student {
        String name="Suboohi";
        int age=20;

        @Override
        public String toString(){
            return "hey";
        }
    }

}
