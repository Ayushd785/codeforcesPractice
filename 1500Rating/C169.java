import java.io.*;
import java.util.*;

public class C169 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] arr = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        long[] priority = new long[n + 2];
        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            queries[i][0] = l;
            queries[i][1] = r;
            priority[l]++;
            priority[r + 1]--;
        }

        for (int i = 1; i <= n; i++) {
            priority[i] += priority[i - 1];
        }

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i + 1;
        }
        Arrays.sort(indices, (a, b) -> Long.compare(priority[b], priority[a]));

        Arrays.sort(arr, 1, n + 1);

        long[] finalArray = new long[n + 1];
        for (int i = 0; i < n; i++) {
            finalArray[indices[i]] = arr[n - i];
        }

        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + finalArray[i];
        }

        long result = 0;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            result += prefixSum[r] - prefixSum[l - 1];
        }

        System.out.println(result);
    }
}
