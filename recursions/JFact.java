import java.util.*;
public class JFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = solve(n);
        System.out.println(ans);
    }
    static long solve(int n){
        if(n == 1){
            return 1;
        }
        return n * solve(n-1);

    }
}
