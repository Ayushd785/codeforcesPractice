import java.util.*;

public class B248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] arr2 = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arr2 = arr.clone();
        Arrays.sort(arr2);

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
            arr2[i] += arr2[i - 1];
        }

        int m = sc.nextInt(); 

        while (m > 0) {
            int type = sc.nextInt();
            int l = sc.nextInt(); 
            int r = sc.nextInt(); 

            long ans;
            if (type == 1) {
                ans = arr[r - 1] - (l > 1 ? arr[l - 2] : 0);
            } else {
                ans = arr2[r - 1] - (l > 1 ? arr2[l - 2] : 0);
            }
            System.out.println(ans);
            m--;
        }
        sc.close();
    }
}
