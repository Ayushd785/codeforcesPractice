import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = 0;
            int leftover = 2*m;
            if(m>=a){
                ans+= a;
                leftover -= a;
            }
            else{
                ans += m;
                leftover -= m;
            }
            if(m>=b){
                ans+= b;
                leftover -= b;
            }
            else{
                ans += m;
                leftover -= m;
            }
            if(leftover>=c){
                ans+= c;
            }
            else{
                ans += leftover;
            }
            System.out.println(ans);

        }
    }
}
