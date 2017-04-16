import java.util.*;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
        // sanity check...

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });

        List<int[]> list = new ArrayList<>();

        for (int[] person : people) {
            if (person[1] >= list.size()) {
                list.add(person);
            } else {
                list.add(person[1], person);
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] people = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        QueueReconstructionbyHeight qh = new QueueReconstructionbyHeight();
        System.out.println(qh.reconstructQueue(people));
    }
}
