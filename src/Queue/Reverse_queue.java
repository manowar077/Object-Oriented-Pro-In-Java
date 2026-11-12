package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Reverse_queue {
    static void main() {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        IO.println(q);
        reverse(q);
        IO.println(q);

    }
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int ii=q.poll();
        reverse(q);
        q.offer(ii);
    }
}
