import java.util.Scanner;

public class B1831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int[] aa = new int[2*n + 1];
            int[] bb = new int[2*n + 1];

            int l = 0;
            while (l < n) {
                int r = l;
                while (r < n && a[r] == a[l]) {
                    r++;
                }
                int count = r - l;
                aa[a[l]] = Math.max(aa[a[l]], count);
                l = r;
            }

            l = 0;
            while (l < n) {
                int r = l;
                while (r < n && b[r] == b[l]) {
                    r++;
                }
                int count = r - l;
                bb[b[l]] = Math.max(bb[b[l]], count);
                l = r;
            }

            int ans = 1;
            for (int i = 0; i <= 2*n; i++) {
                ans = Math.max(ans, aa[i] + bb[i]);
            }

            System.out.println(ans);
        }
    }
}
