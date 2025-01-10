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
            long lb = b*k;
            long ub = b*k + (n)*(k-1);
            if(s<lb || s>ub){
                System.out.println(-1);
                continue;
            }
            long first = Math.min(s, b*k + (k-1));
            al.add(first);
            long diff = s-first;
            for(int i = 0;i<n-1;i++){
                long val = Math.min(diff,k-1);
                al.add(val);
                diff -=val;
            }
            for (int i = 0; i < al.size(); i++) {
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
        }
        
    }
}
