import java.util.HashMap;

/**
 * Created by GelinZHU on 3/16/17.
 */
public class MaxPointsOnALine {
    public static class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        if (points.length == 1) {
            return 1;
        }

        int globalMax = 1;    // At least we have one points if we get here.

        HashMap<Double, Integer> slope = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int localResult = 1;    // At least we have one point for points[i]
            int same = 0;
            int verticals = 1;
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    same++;   // duplicates
                    continue;   // go with next point.
                }

                // for vertical two points, it has no slope, put them in a special group: verticals
                if (points[i].x == points[j].x) {
                    verticals++;
                    continue;
                }
                double gradient = (points[j].y - points[i].y) / (points[j].x - points[i].x);
                if (slope.containsKey(gradient)) {
                    slope.put(gradient, slope.get(gradient) + 1);
                    continue;
                } else {
                    slope.put(gradient, 2);
                    continue;
                }
            }   // end of j loop
            for (Integer value : slope.values()) {
                localResult = Math.max(localResult, value);
            }
            if (verticals >= localResult) {
                localResult = verticals;
            }
            globalMax = Math.max(globalMax, localResult + same);
        }

        return globalMax;
    }
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(-1, -1);
        Point p3 = new Point(2, 2);
        Point[] points = new Point[] {p1, p2, p3};
        MaxPointsOnALine mp = new MaxPointsOnALine();
        System.out.println(mp.maxPoints(points));

    }
}
