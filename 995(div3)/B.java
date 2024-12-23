import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            long onecycle = a+b+c;
            long full = n/onecycle;
            long remaining = n%onecycle;
            long ans = 3*full;
            if(remaining>0){
                ans++;
                remaining -= a;
            }
            if(remaining>0){
                ans++;
                remaining -= b;
            }
            if(remaining>0){
                ans++;
                remaining -= c;
            }
        System.out.println(ans);
        }
    }
}
