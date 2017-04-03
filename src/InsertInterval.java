import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/2/17.
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> result = new ArrayList<>();

        for (Interval i : intervals) {
            if (i.end < newInterval.start) {
                result.add(i);
            } else if (newInterval.end < i.start) {
                result.add(newInterval);
                newInterval = i;
            } else if (i.end >= newInterval.start || i.start <= newInterval.end) {
                newInterval = new Interval(Math.min(i.start, newInterval.start), Math.max(i.end, newInterval.end));
            }
        }

        result.add(newInterval);
        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<Interval>();
    }
}
