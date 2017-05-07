import java.util.*;

/**
 * Created by GelinZHU on 4/30/17.
 */
public class ReconstructItinerary {
    public List<String> findItinerary(String[][] tickets) {
        HashMap<String, PriorityQueue<String>> map = new HashMap<>();
        LinkedList<String> res = new LinkedList<>();
        for(int i = 0; i < tickets.length; i ++) {
            String key = tickets[i][0];
            if(map.get(key) == null) {
                map.put(key, new PriorityQueue<String>());
            }
            map.get(key).offer(tickets[i][1]);
        }
        //
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while(!stack.isEmpty()) {
            String cur = stack.peek();
            if(map.containsKey(cur) && map.get(cur).size() > 0) {
                stack.push(map.get(cur).poll());
            }
            else {
                res.addFirst(stack.pop());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[][] tickets = new String[][] {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        ReconstructItinerary ri = new ReconstructItinerary();
        System.out.println(ri.findItinerary(tickets));
    }
}
