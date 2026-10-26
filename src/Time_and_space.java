public class Time_and_space {
    static void main() {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){

        }
        long end=System.currentTimeMillis();

        IO.println(end-start);
    }
}
