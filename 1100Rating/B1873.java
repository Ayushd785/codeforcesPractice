import java.util.*;

public class B1873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            int[] arr = new int[n];
            int maxwall = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                maxwall = Math.max(maxwall, arr[i]);
            }

            long l = 1;
            long r = x+10000000000l; 
            long ans = 0;

            while (l <= r) {
                long mid = l + (r - l) / 2;
                long sum = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] < mid) {
                        sum += mid - arr[i];
                    }
                }

                if (sum <= x) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
