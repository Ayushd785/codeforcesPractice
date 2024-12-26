import java.util.*;

public class A1881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sourcelen = sc.nextInt();
            int targetlen = sc.nextInt();
            String source = sc.next();
            String target = sc.next();
            int ans = 0;

            while (source.length() < targetlen) {
                source += source; 
                ans++;
            }

            if (source.contains(target)) {
                System.out.println(ans);
            }
            else{
                source+= source;
                ans++;
                if (source.contains(target)) {
                System.out.println(ans);
            }
                else{
                System.out.println(-1);
                }
            }

        }
        sc.close();
    }
}
