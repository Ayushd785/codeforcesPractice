import java.util.*;

public class problemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int k = sc.nextInt(); // Divisor
            int[] arr = new int[n];

            // Input the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;
            int chosenIndex = -1;

            // Iterate over each possible `i`
            for (int i = 0; i < n; i++) {
                boolean canWin = true;

                // Check against all other elements
                for (int j = 0; j < n; j++) {
                    if (i != j && Math.abs(arr[i] - arr[j]) % k == 0) {
                        canWin = false;
                        break;
                    }
                }

                if (canWin) {
                    found = true;
                    chosenIndex = i + 1; // 1-based index
                    break;
                }
            }

            if (found) {
                System.out.println("YES");
                System.out.println(chosenIndex);
            } else {
                System.out.println("NO");
            }
        }

        sc.close(); // Close the scanner
    }
}
