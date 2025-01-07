import java.util.*;

public class C1840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Array size
            int k = sc.nextInt(); // Minimum subarray length
            int q = sc.nextInt(); // Maximum allowed value
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> al = new ArrayList<>();
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] <= q) {
                    count++;
                } else {
                    if (count > 0) {
                        al.add(count);
                    }
                    count = 0;
                }
            }
            if (count > 0) {
                al.add(count);
            }

            long ans = 0;

            for (int segment : al) {
                if (segment >= k) {
                    long validLength = segment - k + 1;
                    ans += validLength * (validLength + 1) / 2;
                }
            }
            System.out.println(ans);
        }
    }
}
