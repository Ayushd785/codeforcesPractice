import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int zeroCount = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zeroCount++;
                }
            }

            if (zeroCount == n) {
                // Case: All elements are zeros
                System.out.println(0);
            } 
            else if (zeroCount == 0 || 
                     (zeroCount == 1 && (arr[0] == 0 || arr[n - 1] == 0)) || 
                     (zeroCount == 2 && arr[0] == 0 && arr[n - 1] == 0)) {
                // Case: No zeros, one zero at the boundary, or two zeros at both boundaries
                System.out.println(1);
            } 
            else {
                // Case: Multiple isolated blocks of zeros
                System.out.println(2);
            }
        }
        sc.close(); 
    }
}
