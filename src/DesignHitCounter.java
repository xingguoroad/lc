import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by GelinZHU on 4/18/17.
 */
public class DesignHitCounter {
    Deque<Integer> queue;

    /** Initialize your data structure here. */
    public DesignHitCounter() {
        queue = new ArrayDeque<>();
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        queue.offer(timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while (queue.size() != 0 && timestamp - queue.peekFirst() >= 300) {
            queue.pop();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        DesignHitCounter dh = new DesignHitCounter();
        dh.hit(1);
        dh.hit(2);
        dh.hit(3);
        dh.getHits(4);
        dh.hit(300);
        dh.getHits(300);
        System.out.println(dh.getHits(301));

    }
}
