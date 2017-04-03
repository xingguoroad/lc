import java.util.*;

/**
 * Created by GelinZHU on 4/2/17.
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> result = new ArrayList<>();

        if (intervals == null || intervals.size() == 0) {
            return result;
        }

        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval v1, Interval v2) {
                if (v1.start != v2.start) {
                    return v1.start - v2.start;
                } else {
                    return v1.end - v2.end;
                }
            }
        });

        Interval pre = intervals.get(0);

        for (int i = 0; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (pre.end < curr.start) {
                result.add(pre);
                pre = curr;
            } else {
                Interval t = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = t;
            }
        }
        result.add(pre);
        return result;
    }
}
