import java.util.*;

public class D1872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();
            long lcm = lcm(x, y);
            long z = n/lcm;
            long pos = n/x-z;
            long neg = n/y-z;
            long ans = 0;
            ans = ans- ((neg)*(neg+1))/2;
            ans = ans+n*pos;
            ans = ans - ((pos)*(pos-1))/2;
            System.out.println(ans);
        }
    }
    public static long  lcm(long a, long b){
        long lcm = (a>b)? a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm++;
        }
    }
}
