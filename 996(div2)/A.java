import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int ans = 1;
            while(n>3){
                n = n/4;
                ans = ans*2;
            }
            System.out.println(ans);
            
        }
    }
    
}
