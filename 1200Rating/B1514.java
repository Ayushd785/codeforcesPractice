import java.util.*;
public class B1514 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long ans = power(n, k);
            System.out.println(ans);
        }
    }
    public static long power(long a, long b){
    final long MOD = (long) 1e9 + 7;
    if(b == 0) return 1;
    long result = power(a,b-1);
    result = result%MOD;
    result = result*a;
    result = result%MOD;
    return result;
    }
}
