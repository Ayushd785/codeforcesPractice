import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int countZero = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                countZero++;
            }
        }

        if (countZero == n) {
            System.out.println(0);
            return;
        }

        if (countZero == 0) {
            System.out.println(1);
            return;
        }

        int count = positiveBlocks(arr);
        System.out.println(count > 1 ? 2 : 1);
    }

    static int positiveBlocks(int[] arr) {
        int count = 0;
        boolean inBlock = false;

        for (int num : arr) {
            if (num != 0) {
                if (!inBlock) {
                    count++;
                    inBlock = true;
                }
            } else {
                inBlock = false;
            }
        }

        return count;
    }
}
