
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(a-b);
            if(diff%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
