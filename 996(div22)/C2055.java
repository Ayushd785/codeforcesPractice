import java.io.*;
import java.util.*;

public class C2055 {
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
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = fr.nextInt();
        while(t-- > 0) {
            int m = fr.nextInt();
            int n = fr.nextInt();
            String s = fr.next();
            long[][] grid = new long[m][n];
            long[] rowsum = new long[m];
            long[] colsum = new long[n];
            
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    grid[i][j] = fr.nextLong();
                    rowsum[i] += grid[i][j];
                    colsum[j] += grid[i][j];
                }
            }
            
            int pi = 0, pj = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'D') {
                    grid[pi][pj] -= rowsum[pi];
                    colsum[pj] -= rowsum[pi];
                    rowsum[pi] = 0;
                    pi++;
                } else {
                    grid[pi][pj] = -colsum[pj];
                    rowsum[pi] -= colsum[pj];
                    colsum[pj] = 0;
                    pj++;
                }
            }
            
            grid[pi][pj] -= rowsum[pi];
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    sb.append(grid[i][j]).append(' ');
                }
                sb.append('\n');
            }
            out.print(sb);
        }
        out.close();
    }
}