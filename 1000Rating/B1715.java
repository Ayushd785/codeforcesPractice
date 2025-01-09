import java.util.ArrayList;
import java.util.Scanner;

public class B1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            ArrayList<Long> al = new ArrayList<>();
            long lb = b * k;
            if (s < lb || (s - lb) > (k * (n - 1))) {
                System.out.println(-1);
                continue;
            } else {
                al.add(lb);
                long diff = s - lb;
                for(int i = 0;i<n-1;i++){
                    long val = Math.min((k-1), diff);
                    al.add(val);
                    diff-=val;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
