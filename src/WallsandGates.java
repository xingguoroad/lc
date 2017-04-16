/**
 * Created by GelinZHU on 4/16/17.
 */
public class WallsandGates {
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms == null) {
            return;
        }

        boolean[][] visited = new boolean[rooms.length][rooms[0].length];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == 0) {
                    dfs(rooms, visited, 0, i, j);
                }
            }
        }
    }

    public void dfs(int[][] rooms, boolean[][] visited, int distance, int i, int j) {


        if (i < 0 || i >= rooms.length || j < 0 || j >= rooms.length) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        if (rooms[i][j] == -1) {
            return;
        }

        if (distance > rooms[i][j]) {
            return;
        }

        visited[i][j] = true;

        if (distance < rooms[i][j]) {
            rooms[i][j] = distance;
        }

        dfs(rooms, visited, distance + 1, i + 1, j);
        dfs(rooms, visited, distance + 1, i - 1, j);
        dfs(rooms, visited, distance + 1, i, j + 1);
        dfs(rooms, visited, distance + 1, i, j - 1);

        visited[i][j] = false;
    }
}
