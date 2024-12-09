import java.util.*;

public class problemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong(); // Input size of the array
            System.out.println(solveTestCase(n));
        }

        sc.close();
    }

    private static long solveTestCase(long n) {
        if (n <= 0) return 0;

        long left = 1;
        long right = 100_000; // Upper bound can be adjusted based on problem constraints
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            
            // Calculate total coverage using a more precise method
            if (calculateCoverage(mid) >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }

    private static long calculateCoverage(long k) {
        // Calculate total coverage using the formula for sum of first k triangular numbers
        return (k * (k + 1) * (k + 2)) / 6;
    }
}