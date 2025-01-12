import java.util.HashMap;
import java.util.Scanner;

public class B1691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            boolean isValid = true;
            for (int freq : map.values()) {
                if (freq < 2) {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) {
                System.out.println(-1);
                continue;
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = i + 1;
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    int temp = ans[i];
                    ans[i] = ans[i + 1];
                    ans[i + 1] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
