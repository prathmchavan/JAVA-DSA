
import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> paths = findPaths(maze);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    private static List<String> findPaths(int[][] maze) {
        List<String> result = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        findPathsUtil(maze, 0, 0, "", result, visited);
        return result;
    }

    private static void findPathsUtil(int[][] maze, int x, int y, String path, List<String> result, boolean[][] visited) {
        int n = maze.length;

        // Base case: Check if destination is reached
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        // Check if current cell is valid
        if (x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0 || visited[x][y]) {
            return;
        }

        // Mark the cell as visited
        visited[x][y] = true;

        // Move Right
        findPathsUtil(maze, x, y + 1, path + "R", result, visited);
        // Move Down
        findPathsUtil(maze, x + 1, y, path + "D", result, visited);
        // Move Left
        findPathsUtil(maze, x, y - 1, path + "L", result, visited);
        // Move Up
        findPathsUtil(maze, x - 1, y, path + "U", result, visited);

        // Unmark the cell as visited for backtracking
        visited[x][y] = false;
    }
}
