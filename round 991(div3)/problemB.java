import java.util.*;

public class problemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt(); // Size of the array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Input array elements
            }

            long sumE = 0; // Sum of even-indexed elements
            long sumO = 0; // Sum of odd-indexed elements
            int noE = 0;   // Count of even-indexed elements
            int noO = 0;   // Count of odd-indexed elements

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) { // Even index
                    sumE += arr[i];
                    noE++;
                } else { // Odd index
                    sumO += arr[i];
                    noO++;
                }
            }

            // Check for equivalence of weighted sums
            if (sumE * noO == sumO * noE && sumE%noE==0 && sumO%noO==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--; // Decrement test cases
        }
        sc.close(); // Close the scanner
    }
}
