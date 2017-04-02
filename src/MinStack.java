import java.util.*;

/**
 * Created by GelinZHU on 3/29/17.
 */
public class MinStack {
    int min;
    Deque<Integer> d;
    Stack<Integer> s;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        min = Integer.MAX_VALUE;
        d = new ArrayDeque<>();
        s = new Stack<>();
    }


    public void push(int x) {

        if (x < this.min) {
            this.min = x;
        }
        d.push(x);
        if (s.size() == 0 || s.peek() > x) {
            s.push(x);
        }
    }


    public void pop() {
        int elem = d.poll();

        if (s.size() != 0 && elem == s.peek()) {
            s.pop();
        }
    }

    public int top() {
        return d.peek();
    }

    public int getMin() {
        if (s.size() > 0)
            return s.peek();
        else
            return 0;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-10);
        ms.push(14);
        ms.getMin();
        ms.getMin();
        ms.push(-20);
        ms.getMin();
        ms.getMin();
        ms.top();
        ms.getMin();
        ms.pop();
        ms.push(10);
        ms.push(-7);
        ms.getMin();
        ms.push(-7);
        ms.pop();
        ms.top();

        System.out.println(ms.getMin());
        ms.pop();
    }
}