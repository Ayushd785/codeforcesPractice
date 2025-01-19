import java.io.*;
import java.util.*;

public class  {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt(); // Number of moves
        int m = in.nextInt(); // Size of the stamp

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) x[i] = in.nextInt();
        for (int i = 0; i < n; i++) y[i] = in.nextInt();

        out.println(calculatePerimeter(n, m, x, y));
        out.close();
    }

    static int calculatePerimeter(int n, int m, int[] x, int[] y) {
        Set<String> coloredCells = new HashSet<>();
        int curX = 0, curY = 0; // Start at the bottom-left corner

        for (int i = 0; i < n; i++) {
            // Move the stamp
            curX += x[i];
            curY += y[i];

            // Stamp the current m x m region
            for (int dx = 0; dx < m; dx++) {
                for (int dy = 0; dy < m; dy++) {
                    coloredCells.add((curX + dx) + "," + (curY + dy));
                }
            }
        }

        // Calculate the perimeter
        int perimeter = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (String cell : coloredCells) {
            String[] parts = cell.split(",");
            int cx = Integer.parseInt(parts[0]);
            int cy = Integer.parseInt(parts[1]);

            // Check each neighbor
            for (int[] dir : directions) {
                int nx = cx + dir[0];
                int ny = cy + dir[1];
                if (!coloredCells.contains(nx + "," + ny)) {
                    perimeter++;
                }
            }
        }

        return perimeter;
    }
}
