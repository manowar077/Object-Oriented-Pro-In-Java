
package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_client {

    public static void main(String[] args) throws Exception{

        Queue<Integer> q = new LinkedList<>();

        // Enqueue (Insert elements)
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        // Dequeue (Remove front element)
        q.poll();

        System.out.println(q);

        // Front element
        System.out.println(q.peek());

        // Check empty
        System.out.println(q.isEmpty());
    }
}
