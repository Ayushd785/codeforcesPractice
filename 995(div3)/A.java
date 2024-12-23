
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int i = 0;
            int ans = 0;
            while(i<n-1){
                if(a[i]>b[i+1]){
                    ans+= a[i] - b[i+1];
                }
                i++;
            }
            ans+= a[n-1];
            System.out.println(ans);
        }
    }
}
