import java.util.Scanner;

public class B1704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            int ans = 0;
            long l = Math.abs(arr[0] - x);
            long r = Math.abs(arr[0] + x);
            for (int i = 0; i < n; i++) {
                l = Math.max(l, Math.abs(arr[i] - x));
                r = Math.min(r, Math.abs(arr[i] + x));
                if (l > r) {
                    ans++;
                    l = Math.abs(arr[i] - x);
                    r = Math.abs(arr[i] + x);
                }
            }
            System.out.println(ans);
        }
    }
}
